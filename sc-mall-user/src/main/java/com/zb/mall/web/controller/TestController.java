package com.zb.mall.web.controller;

import com.zb.mall.commons.dto.RestResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/26 0026.
 */
@Slf4j
@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public RestResultDto test() {
        log.info("------------");
        return RestResultDto.success();
    }

}
