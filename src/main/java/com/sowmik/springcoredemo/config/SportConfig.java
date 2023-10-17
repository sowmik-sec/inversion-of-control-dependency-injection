package com.sowmik.springcoredemo.config;

import com.sowmik.springcoredemo.common.Coach;
import com.sowmik.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
