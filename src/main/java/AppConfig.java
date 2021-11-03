import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "IIsInteger")
    public IsInteger createIsInteger(){
        return new IsInteger();
    };

    @Bean(name = "IBoundaryChecker")
    public BoundaryChecker createBoundaryChecker(){
        return new BoundaryChecker();
    }

    @Bean(name = "IFizzBuzz")
    public FizzBuzz createFizzBuzz(){
        return new FizzBuzz();
    }

    @Bean(name = "iFlowControl")
    public FlowControl createFlowControl(){
        return new FlowControl(createIsInteger(), createBoundaryChecker(), createFizzBuzz());
    }

}
