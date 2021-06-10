package com.hz.server.test.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author huangzhi
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/6/6
 */
public class TestMain {

    public static void main(String[] args) {
       // String starWandStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><res><header><id>1</id><type>startEvent</type><startEvent>begin</startEvent><startInfo>hello world</startInfo></header></res>";
        String xmlData="<?xml version=\"1.0\" encoding=\"utf-8\"?><res><header><type>startEvent11</type></header></res>";
        String jsonStr="{\"id\":\"1\",\"type\":\"startEvent\",\"startEvent\":\"begin\",\"startInfo\":\"hello world\"}";
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectMapper objectMapper = new ObjectMapper();

        Res res = new Res();
        List<BaseElement> startEventList=new ArrayList<>();
        StartEvent startEvent=new StartEvent();
        startEvent.setId("111");
        startEvent.setStartEvent("aaa");
        startEvent.setType("startEvent");
        StartEvent startEvent1=new StartEvent();
        startEvent1.setId("111");
        startEvent1.setStartEvent("aaa");
        startEvent1.setType("startEvent");
        startEventList.add(startEvent);
        startEventList.add(startEvent1);
        res.setBaseElementList(startEventList);
        try {
           String str= xmlMapper.writeValueAsString(res);
          //  startEvent = (StartEvent) objectMapper.readValue(jsonStr, BaseElement.class);
           // System.out.println("--------------------------"+res);
           res=xmlMapper.readValue(str, Res.class);

            System.out.println("--------------------------"+str);
            System.out.println("--------------------------"+res);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
