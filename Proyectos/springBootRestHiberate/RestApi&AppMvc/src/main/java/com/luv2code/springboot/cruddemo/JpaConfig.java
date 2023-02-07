package com.luv2code.springboot.cruddemo;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JpaConfig {

	//https://howtodoinjava.com/spring-boot2/datasource-configuration/
    @Bean(name = "mySqlDataSource")
    @Primary
    public DataSource mySqlDataSource()
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/employee_directory?useSSL=false&serverTimezone=UTC");
        dataSourceBuilder.username("webstudent");
        dataSourceBuilder.password("webstudent");
        return dataSourceBuilder.build();
    }
}