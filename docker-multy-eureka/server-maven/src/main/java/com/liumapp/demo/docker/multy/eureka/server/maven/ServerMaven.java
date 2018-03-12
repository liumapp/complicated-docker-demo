package com.liumapp.demo.docker.multy.eureka.server.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by liumapp on 3/12/18 2:40 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerMaven {

    public static void main(String[] args) {
        SpringApplication.run(ServerMaven.class , args);
    }

}
