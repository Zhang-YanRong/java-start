package com.springboot.result;

import java.util.HashMap;
import java.util.Map;

public class CommonCode {
    private final String successCode = "200";
    private static Map codeMap = null;

    protected CommonCode(){
        Map<String, String> codeMap = new HashMap();

        codeMap.put("200", "操作成功");
        codeMap.put("500", "操作失败");
        codeMap.put("404", "参数检验失败");
        codeMap.put("401", "暂未登录或token已经过期");
        codeMap.put("403", "暂无权限");

        this.codeMap = codeMap;
    }

    public static String getSuccessCode(){
        return successCode;
    }

    public static String getSuccessMsg(){
        String msg = (String) codeMap.get("200");
        return msg;
    }
}
