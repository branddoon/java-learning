package com.annotation.impl;

import com.annotation.interfaces.AnimalRequired;
import com.annotation.interfaces.FieldRequired;
import com.annotation.interfaces.RunInmmediately;

@AnimalRequired
public class Dog {

    @FieldRequired
    public String name;

    public int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @RunInmmediately(times = 3)
    public void calculateAgeInHumanYears(){
        System.out.println("The human age is: " + (16 * Math.log(age) + 31));
    }

}
