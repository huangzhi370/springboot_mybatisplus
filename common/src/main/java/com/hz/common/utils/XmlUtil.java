package com.hz.common.utils;

import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.*;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @Description
 * @Author huangzhi
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/6/6
 */
public class XmlUtil {

    public static List<Map<String, Object>> xmlToMap(String result) throws IOException, SAXException, ParserConfigurationException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc = db.parse(new InputSource(new ByteArrayInputStream(result.getBytes("GBK"))));
        NodeList bookList = doc.getElementsByTagName("equipment");

        List<Map<String, Object>> list = new ArrayList();

        for (int i = 0; i < bookList.getLength(); i++) {
            Node book = bookList.item(i);
            NamedNodeMap attrs = book.getAttributes();
            for (int j = 0; j < attrs.getLength(); j++) {
                Node attr = attrs.item(j);
            }
            NodeList childNodes = book.getChildNodes();
            Map<String, Object> map = new HashMap();
            for (int k = 0; k < childNodes.getLength(); k++) {

                String Code = doc.getElementsByTagName("code").item(0).getChildNodes().item(0).getNodeValue();
                String Message = doc.getElementsByTagName("message").item(0).getChildNodes().item(0).getNodeValue();
                String Rownum = doc.getElementsByTagName("rownum").item(0).getChildNodes().item(0).getNodeValue();

                map.put("code", Code);
                map.put("message", Message);
                map.put("rownum", Rownum);

                //组织成某种格式 传回去然后 再转成entity
                if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
                    String name = childNodes.item(k).getNodeName();
                    String value = childNodes.item(k).getTextContent();
                    //set key,value
                    map.put(name, value);
                }
            }
            list.add(map);
        }
        return list;
    }

    public static Object transMap2Bean(Map<String, Object> map, Object obj) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                if (map.containsKey(key)) {
                    Object value = map.get(key);
                    // 得到property对应的setter方法
                    Method setter = property.getWriteMethod();
                    setter.invoke(obj, value);
                }
            }
        } catch (Exception e) {
        }
        return obj;
    }
}