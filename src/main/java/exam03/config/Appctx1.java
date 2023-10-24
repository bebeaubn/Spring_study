package exam03.config;

import exam03.models.member.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppCtx2.class)
public class Appctx1 {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }
    public  MemberDao memberDao2(){
        return new MemberDao();
    }
}
