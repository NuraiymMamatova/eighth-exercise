package packagemain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import packagemain.entity.Dog;
import packagemain.entity.Person;
import packagemain.util.Util;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Util.class);
        Dog dog = context.getBean("getDog", Dog.class);
        System.out.println(dog);
        dog.animalMinus();
        dog.animalPlus();
        dog.init();
        dog.destroy();
        Person person = context.getBean("getPerson", Person.class);
        System.out.println(
                "Person name: " + person.getName() +
                        "\nPerson age: " + person.getAge() +
                        "\nDog: " + person.getDog()
        );
        person.getDog().animalPlus();
        person.getDog().animalMinus();
        context.close();
    }
}
