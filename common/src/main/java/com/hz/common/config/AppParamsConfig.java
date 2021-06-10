package com.hz.common.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author huangzhi
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/5/21
 */
@Configuration
@RefreshScope
@Data
public class AppParamsConfig {

    @Value("${appParams.branchCode}")
    private String branchCode;

    @Value("${appParams.exprotPushFileDir}")
    private String exprotPushFileDir;

    @Value("${appParams.leadPushNum}")
    private Integer leadPushNum;

    @Value("${appParams.peoPushNum}")
    private Integer peoPushNum;
}
