package com.zb.mall.configuration;

import com.zb.mall.commons.dto.RestResultDto;
import com.zb.mall.commons.exception.LogicException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * Created by Administrator on 2018/6/26 0026.
 */
@Slf4j
@RestControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public RestResultDto exceptionHandler(Exception e) {
        String errorMessage = "出错啦，请稍后再试。";
        RestResultDto resultDto = RestResultDto.fail(errorMessage);

        if (e instanceof BindException) {
            // 普通对象参数校验
            BindingResult result = (BindingResult) e;
            errorMessage = result.getAllErrors().get(0).getDefaultMessage();
            log.error("参数绑定失败: {}", errorMessage);
            resultDto.setCode(400);
        }
        else if (e instanceof MethodArgumentNotValidException) {
            // 复杂对象参数嵌套校验
            MethodArgumentNotValidException ex = (MethodArgumentNotValidException) e;
            errorMessage = ex.getBindingResult().getAllErrors().get(0).getDefaultMessage();
            log.error("参数绑定失败: {}", errorMessage);
            resultDto.setCode(400);
        }
        else if (e instanceof ConstraintViolationException) {
            // 简单参数直接校验
            ConstraintViolationException ex = (ConstraintViolationException) e;
            errorMessage = ex.getConstraintViolations().stream().findFirst().get().getMessage();
            log.error("参数绑定失败: {}", errorMessage);
            resultDto.setCode(400);
        } else if (e instanceof LogicException) {
            LogicException ex = (LogicException) e;
            errorMessage = ex.getErrorCode() + ":" + ex.getErrorMessage();
            log.error("自定义异常: {}", errorMessage);
        }
        else {
            log.error("出错啦", e);
        }

        resultDto.setMessage(errorMessage);
        return resultDto;
    }

}
