package az.spring.demo;

public class Notification {
     private Message message;
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
