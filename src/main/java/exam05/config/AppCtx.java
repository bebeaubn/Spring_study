package exam05.config;

import exam05.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppCtx {
    @Bean
    public Message message() {
        return new Message();
    }
}
