package az.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Notification notification = context.getBean("notification4",Notification.class);
        notification.alert();
    }
}
