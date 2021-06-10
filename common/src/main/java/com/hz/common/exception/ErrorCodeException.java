package com.hz.common.exception;

import com.hz.common.message.IErrorMessage;
import lombok.Data;

/**
 * @Description
 * @Author huangzhi
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/5/21
 */
@Data
public class ErrorCodeException extends RuntimeException {
    public ErrorCodeException( IErrorMessage iErrorMessage){
        super("user not exit");
        this.code = iErrorMessage.getCode();
        this.desc = iErrorMessage.getDescription();
    }
    private final String code;

    private final String desc;

}
