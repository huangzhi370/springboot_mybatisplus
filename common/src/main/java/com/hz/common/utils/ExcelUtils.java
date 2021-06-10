package com.hz.common.utils;

import com.alibaba.excel.EasyExcelFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @Description
 * @Author huangzhi
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/5/20
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExcelUtils {

    public  static <T> void exprotExcel(String fileName, HttpServletResponse response, Class<T> tClass, List<T> dataList){
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        try {
            EasyExcelFactory.write(response.getOutputStream(), tClass).sheet(fileName).doWrite(dataList);
        } catch (IOException e) {
            log.error("文件导出失败异常");
        }
    }

    public  static <T> void exprotExcelByFile(String fileName,String filePath , Class<T> tClass, List<T> dataList){
       try {
           FileOutputStream output = new FileOutputStream(filePath);
           EasyExcelFactory.write(output, tClass).sheet(fileName).doWrite(dataList);
           output.flush();
           output.close();
       } catch (IOException e) {
            log.error("文件导出失败异常",e);
        }
    }
}
