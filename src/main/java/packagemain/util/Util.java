package packagemain.util;

import org.springframework.context.annotation.*;
import packagemain.entity.Dog;
import packagemain.entity.Person;

@Configuration
@ComponentScan("packagemain")
@PropertySource("application.properties")
public class Util {

    @Bean
    @Scope("prototype")
    public Dog getDog() {
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    public Person getPerson() {
        return new Person();
    }

}
