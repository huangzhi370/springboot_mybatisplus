package com.hz.server.test.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
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
@JacksonXmlRootElement(localName = "header")
public class StartEvent extends BaseElement {

    @JacksonXmlProperty(localName = "id")
    private String id;

    @JacksonXmlProperty(localName = "type")
    private String type;

    @JacksonXmlProperty(localName = "startEvent")
    private String startEvent;

    @JacksonXmlProperty(localName = "startInfo")
    private String startInfo;



}
