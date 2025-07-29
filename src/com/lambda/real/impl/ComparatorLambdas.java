package com.lambda.real.impl;

import lombok.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdas {

    public void execute(){
        List<Integer> numbers = Arrays.asList(8,4,7,2,3,9,8,9,22,300);
        numbers.sort((a,b) -> a - b);
        System.out.println("Numbers: " + numbers);
        List<String> names = Arrays.asList("Tomas","Lisa","Andrea","Pedro");
        names.sort(Comparator.naturalOrder());
        System.out.println("Names: " + names);
        List<Person> persons = Arrays.asList(new Person("Szczęsny", 31), new Person("Robert", 31), new Person("Lamine", 17), new Person("Marc Casado", 22));
        persons.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
        System.out.println("Persons: " + persons);
    }
}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
class Person{

    private String name;

    private Integer age;
}
