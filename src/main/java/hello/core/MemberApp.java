package hello.core;

import hello.core.member.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService =
                applicationContext.getBean("memberService", MemberService.class);
        Member member = new Member(1L, "a", Grade.VIP);
        Member findMember = memberService.join(member);
        System.out.println(findMember.getName());
    }
}
