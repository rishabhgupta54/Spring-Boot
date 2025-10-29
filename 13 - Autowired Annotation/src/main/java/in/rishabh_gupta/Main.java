package in.rishabh_gupta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);

        Manager manager = applicationContext.getBean("manager", Manager.class);
        System.out.println(manager);
    }
}
