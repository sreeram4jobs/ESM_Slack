
package com.nano.pro;

import javax.servlet.annotation.MultipartConfig;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages= {"com.nano.pro","com.nano.pro.Category","com.nano.pro.Education","com.nano.pro.toys","com.nano.pro.HandMade","com.nano.pro.nitting","com.nano.pro.franchise","com.nano.pro.hospital","com.nano.pro.LoginForm","com.nano.pro.dealsamount","com.nano.pro.employee"})
@MultipartConfig(maxFileSize = 16177215) 


////1394246047//  450611880

public class ConfigurationFile {

	
	
@Bean	
public InternalResourceViewResolver  viewResolver() {
	InternalResourceViewResolver  view=new InternalResourceViewResolver();
view.setViewClass(JstlView.class);
view.setPrefix("/");
view.setSuffix(".jsp");
return view;
}
	

@Bean
public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://myhallinstance.ciqrtcmarqft.ap-south-1.rds.amazonaws.com:3306/MyHall");
    dataSource.setUsername("MyHallUser");
    dataSource.setPassword("ESMPassword");
    return dataSource;
}

@Bean
public JdbcTemplate jdbcTemplate(DataSource dataSource) {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    //jdbcTemplate.setResultsMapCaseInsensitive(true);
    return jdbcTemplate;
}



@Bean(name = "multipartResolver")
public CommonsMultipartResolver getCommonsMultipartResolver() {
    CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
    multipartResolver.setMaxUploadSize(1394246047);   // 20MB//20971520
    multipartResolver.setMaxInMemorySize(1048576);  // 1MB
    return multipartResolver;
}

}
