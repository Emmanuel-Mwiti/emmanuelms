package com.emmanuel.customer.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Emmanuel Mwiti on Mar 2024
 **/
@Configuration
public class CustomerConfig {

//    Options are:
//    1. Open feign- favourite one
//    2. Rest template
//    3. Load balancing,

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
