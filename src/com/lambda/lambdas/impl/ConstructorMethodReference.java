package com.lambda.lambdas.impl;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class ConstructorMethodReference {

    public void execute(){
        Supplier<MyObject> normalSupplier = () -> new MyObject();
        Supplier<MyObject> supplierByReference = MyObject::new;
        System.out.println("Normal: "+ supplierByReference.get());
        System.out.println("By reference: " + supplierByReference.get());
    }
}

class MyObject {

    private String string;

    private Integer num;

    public MyObject() {
        this.string = UUID.randomUUID().toString();
        this.num = new Random().nextInt(1000);
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "string='" + string + '\'' +
                ", num=" + num +
                '}';
    }
}