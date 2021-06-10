package com.hz.common.message.enmus;

import lombok.Getter;

/**
 * @Description 警情级别
 * @Author huangzhi
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/5/21
 */
@Getter
public enum AlarmLevelEnum {
    ORDINARY("0", "普通");

    private String code;

    private String desc;

    AlarmLevelEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
