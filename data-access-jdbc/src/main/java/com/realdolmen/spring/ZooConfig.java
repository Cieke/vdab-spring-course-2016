package com.realdolmen.spring;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@SpringBootApplication
public class ZooConfig {
    // TODO: add a datasource for the production profile. We will use BasicDataSource from Apache DBCP. Use connection properties for MySQL (url = "jdbc:mysql://localhost:3306/zoo", user = "root", password = "")

    @Bean
    @Profile("production")
    public DataSource dataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/Zoo");
        ds.setUsername("root");
        ds.setPassword("root");

        ds.setMaxActive(50);


        return ds;
    }



    // TODO: add a JDBC template
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
}
}
