package exam01.main;

import exam01.Greet;
import exam01.config.AppCtx;

public class EX01 {
    public static void main(String[] args) {
        //스프링 컨테이너
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext
                (AppCtx.class);
        Greet g1 = ctx.getBean("greet", Greet.class);
        g1.hello("이이름");

        ctx.close();

    }
}