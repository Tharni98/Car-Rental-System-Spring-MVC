package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * author - Tharani
 * version - 1.0.0 10:26 AM 10/25/2023
 **/

@Configuration
@Import({JPAConfig.class})
public class WebRootConfig {
}
