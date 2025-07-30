package com.generic.impl;

import com.generic.model.Animal;
import com.generic.model.Being;
import com.generic.model.Snake;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcard {

    public void execute(){
        List<Being> beings = new ArrayList<>();
        beings.add(new Being("Human"));
        beings.add(new Being("Animal"));

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Giraffe"));
        animals.add(new Snake("Snake"));
        animals.add(new Animal("Shark"));

        List<Snake> snakes = new ArrayList<>();
        snakes.add(new Snake("Cobra Snake"));
        System.out.println("---Beings---");
        showElements(beings);
        System.out.println("---Animals---");
        showElements(animals);
        System.out.println("---Snakes---");
        showElements(snakes);
    }

    public void showElements(List<? extends Being> list){
        for (Being e: list){
            System.out.println(e);
        }
    }
}
