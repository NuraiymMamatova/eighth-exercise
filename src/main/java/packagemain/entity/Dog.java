package packagemain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import packagemain.service.Animal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Dog implements Animal {

    @Value("${dog.name}")
    private String name;

    @Value("${dog.age}")
    private Integer age;

    @Value("${dog.color}")
    private String color;

    public void animalPlus() {
        System.out.println("this method name animal plus");
    }

    public void animalMinus() {
        System.out.println("this method name animal minus");
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }
}
