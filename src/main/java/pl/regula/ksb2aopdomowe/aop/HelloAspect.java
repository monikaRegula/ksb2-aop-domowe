package pl.regula.ksb2aopdomowe.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.regula.ksb2aopdomowe.email.EmailService;

@Aspect
@Component
public class HelloAspect {

    private EmailService emailService;

    @Autowired
    public HelloAspect(EmailService service) {
        this.emailService = service;
    }

    @After("@annotation(SendAnEmail)")
    public void sendEmailAfterAddedVideo() {
        System.out.println("HelloAspect @After");
        this.emailService.sendEmail();
    }

}
