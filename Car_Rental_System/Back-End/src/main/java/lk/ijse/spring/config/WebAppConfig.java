package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * author - Tharani
 * version - 1.0.0 10:25 AM 10/25/2023
 **/

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.spring")
public class WebAppConfig {


}
