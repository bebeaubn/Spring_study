package exam01.config;

import exam01.Greet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //에노테이션 문제

public class AppCtx {
    @Bean
    public Greet greet() {
        return new Greet(); //관련 객체임을 알려줌
    }
}


