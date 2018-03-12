package com.liumapp.demo.docker.multy.eureka.server.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by liumapp on 3/12/18 2:23 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaProfile {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProfile.class , args);
    }

}
