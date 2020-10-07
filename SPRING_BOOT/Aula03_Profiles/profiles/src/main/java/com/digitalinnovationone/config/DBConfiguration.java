package com.digitalinnovationone.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private  String password;

    @Profile("dev")
    @Bean
    public String TestDataBaseConnection(){
        System.out.println("DB Connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
        return "DB Connection to H2_TEST - Test Instance";
    }

    @Profile("dev")
    @Bean
    public String productionDataBaseConnection(){
        System.out.println("DB Connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
        return "DB Connection to MYSQL  - Production - MYSQL";
    }
}
