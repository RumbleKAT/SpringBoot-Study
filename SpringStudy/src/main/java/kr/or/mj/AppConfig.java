package kr.or.mj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.or.mj.AddCalculator;
import kr.or.mj.Calculator;

@Configuration
public class AppConfig{
    @Bean
    Calculator calculator(){
        return new AddCalculator();
    }
}