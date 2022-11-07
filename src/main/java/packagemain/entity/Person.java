package packagemain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import packagemain.service.Animal;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private Integer age;

    @Autowired
    private Animal dog;

}
