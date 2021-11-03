import interfaces.IBoundaryChecker;
import interfaces.IFizzBuzz;
import interfaces.IFlowControl;
import interfaces.IIsInteger;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IFlowControl iFC = (IFlowControl) context.getBean("iFlowControl");
        System.out.println("Hey give me a number!");
        String input = scanner.nextLine();

        iFC.run(input);

    }
}
