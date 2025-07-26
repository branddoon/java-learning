package com.lambda.lambdas.impl;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionApp {

    static Function<Integer, Integer> multiply = n -> n * 10;
    static Function<Integer, Integer> sum = n -> n + 10;
    static Function<Integer, Integer> addThenMultiply = multiply.andThen(sum);
    static Function<Cat, Integer> getHumanAgeInCat = e -> e.getAge() * 4;
    static Function<Cat, ByteArrayOutputStream> serializer = p -> {
        ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();
        try(ObjectOutputStream outputStream = new ObjectOutputStream(inMemoryBytes)){
            outputStream.writeObject(p);
            outputStream.flush();
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
        return inMemoryBytes;
    };
    static Function<ByteArrayInputStream, Cat> deserializer = bytes -> {
        try(ObjectInputStream inputStream = new ObjectInputStream(bytes)){
            return (Cat) inputStream.readObject();
        }catch (IOException | ClassNotFoundException exception){
            System.err.println(exception.getMessage());
            throw new RuntimeException(exception.getMessage());
        }
    };

    public void execute(){
        System.out.println("Multiply: "+ multiply.apply(10));
        System.out.println("Sum: "+ sum.apply(10));
        System.out.println("Add then: " + addThenMultiply.apply(10));
        System.out.println("Cat age: "+ getHumanAgeInCat.apply(new Cat("Lisa", 5)));
        ByteArrayOutputStream objectSerialized = serializer.apply(new Cat("Lolita", 4));
        System.out.println("Serializer: " + Arrays.toString(objectSerialized.toByteArray()));
        Cat catDeserialized = deserializer.apply(new ByteArrayInputStream(objectSerialized.toByteArray()));
        System.out.println("Deserializer: " + catDeserialized);
    }
}
class Cat implements Serializable {
    String name;
    Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
