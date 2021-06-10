package com.hz.server.test.jackson;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.ToString;

/**
 * @Description
 * @Author huangzhi
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/6/6
 */
@ToString(callSuper = true)
@Data
public class EndEvent extends BaseElement{

    private String endEvent;
    private String endInfo;
}
