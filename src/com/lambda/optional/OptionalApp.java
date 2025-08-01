package com.lambda.optional;

import com.lambda.optional.impl.OptionalOperator;

public class OptionalApp {

    public static void main(String [] args){
        System.out.println("1. Optional");
        OptionalOperator optionalOperator = new OptionalOperator();
        optionalOperator.executeOptional();
        System.out.println("2. Optional nullable");
        optionalOperator.executeOptionalNullable();
        System.out.println("3. Optional map");
        optionalOperator.executeOptionalMap();
        System.out.println("4. Optional flatmap");
        optionalOperator.executeOptionalFlatMap();
    }
}
