package springCoreAssignment.Qun4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test4 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

        BankAccountController controller = (BankAccountController)context.getBean("controller");


        System.out.println(controller.getBalance(1171));
        System.out.println(controller.deposit(1171,5000));
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(controller.withdraw(1171,5000));
        System.out.println(controller.getBalance(1171));
        System.out.println("___________________________________________");
        System.out.println(controller.fundTransfer(1171,1172,5000));
        System.out.println(controller.getBalance(1171));
        System.out.println(controller.getBalance(1172));


    }
}
