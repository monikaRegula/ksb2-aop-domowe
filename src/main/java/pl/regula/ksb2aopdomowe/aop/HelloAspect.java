package pl.regula.ksb2aopdomowe.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

    @After("@annotation(HelloApect)")
    public void sendEmail(){

    }
}
