package com.annotation;

import com.annotation.impl.Dog;
import com.annotation.interfaces.AnimalRequired;
import com.annotation.interfaces.FieldRequired;
import com.annotation.interfaces.RunInmmediately;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationApplication {

    public static void main(String []args) throws InvocationTargetException, IllegalAccessException {
        Dog dog = new Dog("Toby", 3);
        if(dog.getClass().isAnnotationPresent(AnimalRequired.class)){
            System.out.println("This dog class is animal required");
        }else{
            System.out.println("This dog class is not animal required");
        }
        for(Method method : dog.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(RunInmmediately.class)){
                RunInmmediately annotation = method.getAnnotation(RunInmmediately.class);
                for(int i=0; i < annotation.times(); i++){
                    method.invoke(dog);
                }
            }
        }
        for(Field field : dog.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(FieldRequired.class)){
                System.out.println("The field: " + field.getName() + " is required.");
                Object objectValue = field.get(dog);
                if(objectValue instanceof String stringValue){
                    System.out.println("It's value is: " + stringValue);
                }
            }
        }

    }
}
