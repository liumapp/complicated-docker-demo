package com.liumapp.demo.docker.multy.eureka.server.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by liumapp on 3/10/18 3:32 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableEurekaServer
@SpringBootApplication
public class MultyEurekaA {

    public static void main(String[] args) {
        SpringApplication.run(MultyEurekaA.class , args);
    }

}
