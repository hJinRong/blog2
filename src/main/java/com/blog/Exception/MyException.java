package com.blog.Exception;

/**
 * @author Goddran
 * @version 1.0
 * @date 2020/11/308:12
 */


public class MyException extends RuntimeException {

    private Integer code;

    private String message;

    public MyException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public MyException(String message) {
        this.code = 500;
        this.message = message;
    }

    public MyException() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
