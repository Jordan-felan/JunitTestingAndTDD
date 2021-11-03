import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "iIsInteger")
    public IsInteger createIsInteger(){
        return new IsInteger();
    };

    @Bean(name = "iBoundaryChecker")
    public BoundaryChecker createBoundaryChecker(){
        return new BoundaryChecker();
    }

    @Bean(name = "iFizzBuzz")
    public FizzBuzz createFizzBuzz(){
        return new FizzBuzz();
    }

    @Bean(name = "iFlowControl")
    public FlowControl createFlowControl(){
        return new FlowControl(createIsInteger(), createBoundaryChecker(), createFizzBuzz());
    }

}
