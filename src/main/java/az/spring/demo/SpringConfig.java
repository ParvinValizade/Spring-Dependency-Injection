package az.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean("sms")
    public Message getSms() {
        return new Sms();
    }

    @Bean("email")
    public Message getEmail() {
        return new Email();
    }

    @Bean
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setName("Parvin");
        employee.setSurname("Valizade");

        return employee;
    }

    @Bean
    public Notification getNotification(Message sms,Employee employee){
        Notification notification = new Notification();
        notification.setMessage(sms);
        notification.setEmployee(employee);

        return notification;
    }
    @Bean
    public Notification getNotification2(){
        Notification notification = new Notification();
        notification.setMessage(getEmail());
        notification.setEmployee(getEmployee());

        return notification;
    }
}
