package com.blog.enums;

/**
 * @author Goddran
 * @version 1.0
 * @date 2020/11/300:41
 */
public enum LogTypeEnum {
    /**
     * 操作
     */
    OPERATION("operation"),

    /**
     * 登录
     */
    LOGIN("login"),

    /**
     * 违规记录
     */
    BAN("ban");

    private String value;

    LogTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
