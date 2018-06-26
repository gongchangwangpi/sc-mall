package com.zb.mall.commons.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 *
 * Created by Administrator on 2018/5/12 0012.
 */
@Getter
@Setter
@NoArgsConstructor
public class RestResultDto implements Serializable {

    private int code;

    private String message;

    private long timestamp = System.currentTimeMillis();

    private Object body;

    public RestResultDto(int code, String message) {
        this(code, message, null);
    }

    public RestResultDto(int code, String message, Object body) {
        this.code = code;
        this.message = message;
        this.body = body;
    }

    public static RestResultDto fail(String message) {
        return new RestResultDto(500, message);
    }

    public static RestResultDto success() {
        return new RestResultDto(200, "OK");
    }

    public static RestResultDto success(Object body) {
        return new RestResultDto(200, "OK", body);
    }
}
