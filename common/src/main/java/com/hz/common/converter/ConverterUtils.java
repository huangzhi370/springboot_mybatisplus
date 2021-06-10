package com.hz.common.converter;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description
 * @Author huangzhi
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/5/23
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConverterUtils {

    public static LocalDateTime converterLocalDateTime(String dateStr){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       return LocalDateTime.parse(dateStr,df);
    }
}
