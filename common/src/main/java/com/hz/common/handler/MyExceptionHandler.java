package com.hz.common.handler;

import com.alibaba.fastjson.JSONObject;
import com.hz.common.exception.ErrorCodeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Description
 * @Author huangzhi
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/5/25
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = ErrorCodeException.class)
    public String exceptionHandler(ErrorCodeException e){
        JSONObject resultJson=new JSONObject();
        resultJson.put("code",e.getCode());
        resultJson.put("message",e.getDesc());
        return resultJson.toJSONString();
    }
}

