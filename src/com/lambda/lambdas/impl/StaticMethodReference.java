package com.lambda.lambdas.impl;

import java.util.UUID;
import java.util.function.Supplier;

public class StaticMethodReference {

    public void execute (){
        Supplier<UUID>getTokenByLambda = () -> UUID.randomUUID();
        Supplier<UUID> getTokenByReference = UUID::randomUUID;
        System.out.println("Lambda: " + getTokenByLambda.get());
        System.out.println("Reference: " + getTokenByReference.get());
    }
}
