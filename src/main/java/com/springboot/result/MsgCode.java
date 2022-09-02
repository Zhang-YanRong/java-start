package com.springboot.result;

public class MsgCode {
    private String code;
    private String msg;

    public MsgCode(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }
}
