package com.lambda.optional.impl;

import com.lambda.util.Car;
import com.lambda.util.Database;
import com.lambda.util.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalOperator {

    public void executeOptional(){
        Optional<Car> opt = Optional.of(Database.cars.get(1));;
        System.out.println(opt.get());
    }

    public void executeOptionalNullable(){
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add(null);
        names.add("Mario");
        Optional<String> optNullable = Optional.ofNullable(names.get(1));
        System.out.println(optNullable.orElse("Anonymous"));
        //System.out.println(optNullable.orElseThrow( () -> new RuntimeException("Name not found")));
    }

    public void executeOptionalMap(){
        Optional<Car> opt = Optional.of(Database.cars.get(1));
        String r = opt.map( e -> "The official website is " + e.getOfficialWebsite())
                .orElseThrow(RuntimeException::new);
        System.out.println(r);
    }

    public void executeOptionalFlatMap(){
        Phone phone = new Phone("Iphone 15 pro", 15000.0);
        Optional<Phone> opt = Optional.of(phone);
        String phoneName = opt.flatMap( Phone::getName).orElse(null);
        System.out.println(phoneName);
    }
}
