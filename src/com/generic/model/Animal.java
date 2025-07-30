package com.generic.model;

public class Animal extends Being{
    public Animal(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
