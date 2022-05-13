package com.zzc.air_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zzc.air_system.mapper")
public class AirSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirSystemApplication.class, args);
        String cmd = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://localhost:8080/users/index";
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec(cmd);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
