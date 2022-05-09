package az.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Notification {

    @Autowired
    @Qualifier("email")
     private Message message;

    @Autowired
     private Employee employee;

     //constructor injection
    public Notification(Employee employee) {
        this.employee = employee;
    }

    public Notification() {
        System.out.println("Notification constructor worked..");
    }

    //setter injection
    public void setMessage(Message message) {
        this.message = message;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void alert() {
         System.out.println("Notification...");
        System.out.println(employee);
         message.send();
     }
}
