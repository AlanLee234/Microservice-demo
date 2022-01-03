package com.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.common.security.annotation.EnableCustomConfig;
import com.common.security.annotation.EnableRyFeignClients;
import com.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 *
 * @author AlanLee
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class SystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SystemApplication.class, args);
        System.out.println("system系统模块启动成功");
    }
}
