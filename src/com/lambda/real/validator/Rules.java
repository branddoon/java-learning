package com.lambda.real.validator;

import com.lambda.util.Car;

import java.util.List;
import java.util.Objects;

public class Rules {

    static Validator<Car, RuntimeException> isNull = car -> {
        if(Objects.isNull(car)) throw new RuntimeException("Car object must not be null");
    };

    static Validator<Car, RuntimeException> validPrice = car -> {
        if (car.getPrice() < 100000) throw new RuntimeException("Car should not be less than 100k");
    };

    public static List<Validator<Car, RuntimeException>> rules = List.of(isNull, validPrice);

}
