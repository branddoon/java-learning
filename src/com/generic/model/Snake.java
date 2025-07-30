package com.generic.model;

public class Snake extends Animal{
    public Snake(String name){
        super(name);
    }
    @Override
    public String toString() {
        return "Snake{" +
                "name='" + name + '\'' +
                '}';
    }
}
