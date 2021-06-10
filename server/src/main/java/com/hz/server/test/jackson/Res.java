package com.hz.server.test.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author huangzhi
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/6/6
 */
@Data
@JacksonXmlRootElement(localName = "res")
public class Res {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "orderTrans")
    private List<BaseElement> baseElementList;
}
