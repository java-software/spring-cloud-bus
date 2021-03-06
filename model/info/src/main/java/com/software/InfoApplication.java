package com.software;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/11/10
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class InfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfoApplication.class, args);
    }
}
