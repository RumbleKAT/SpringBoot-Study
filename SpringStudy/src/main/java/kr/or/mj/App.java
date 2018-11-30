package kr.or.mj;

import kr.or.mj.AddCalculator;
import org.springframework.context.annotation.Import;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import java.util.Scanner;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class App 
{
    public static void main( String[] args )
    {
        try(ConfigurableApplicationContext context = SpringApplication.run(App.class,args)){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter 2 numbers like 'a b'");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            Calculator calculator = context.getBean(Calculator.class);
            int result = calculator.calc(a, b);
            System.out.println("result = " + result);
        }
    } 
}

/*
    try (ConfigurableApplicationContext context = SpringApplication.run(App.class, args)) {
        App m = context.getBean(App.class); 
        m.hello(); 
    } 

*/
