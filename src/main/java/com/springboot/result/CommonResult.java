package com.springboot.result;

import org.springframework.beans.factory.annotation.Autowired;

public class CommonResult<T> {
    private String code;
    private String message;
    private  T data;

    public CommonResult() {

    }

    protected CommonResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     */
    public static <T> CommonResult<T> success(String data) {

        String code = CommonCode.getSuccessCode();
        String msg = CommonCode.getSuccessMsg();
        return new CommonResult<T>(code, msg, (T) data);
    }


}
