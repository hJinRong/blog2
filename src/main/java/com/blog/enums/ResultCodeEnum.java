package com.blog.enums;

/**
 * @author Goddran
 * @version 1.0
 * @date 2020/11/300:40
 */
public enum ResultCodeEnum {
    /**
     * 成功
     */
    SUCCESS(1),

    /**
     * 失败
     */
    FAIL(0);

    Integer code;

    ResultCodeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
