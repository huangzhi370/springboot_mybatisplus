package com.hz.common.message.enmus;

import com.hz.common.message.IErrorMessage;
import lombok.Getter;

/**
 * @Description 异常分支
 * @Author huangzhi
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/5/21
 */
@Getter
public enum ErrorMessageEnum implements IErrorMessage {
    USER_NOT_FOUND("1001", "用户不存在!");

    private String code;

    private String description;

    ErrorMessageEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
