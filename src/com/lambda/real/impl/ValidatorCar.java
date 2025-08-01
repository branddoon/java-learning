package com.lambda.real.impl;

import com.lambda.real.validator.Rules;
import com.lambda.real.validator.Validator;
import com.lambda.util.Database;

public class ValidatorCar {

    public void execute(){
        Validator.applyRules(Rules.rules, Database.cars.get(0));
        System.out.println("Rules have been applied");
    }
}
