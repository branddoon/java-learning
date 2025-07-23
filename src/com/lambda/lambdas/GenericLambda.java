package com.lambda.lambdas;

import com.lambda.entity.Product;

public class GenericLambda {

    public void execute(){
        Printer<String> printString = string -> System.out.println(string);
        printString.print("Hi world");
        Printer<Product> printProduct = product -> System.out.println(product);
        printProduct.print(new Product(1L, "T-shirt", 100.0));
    }

}
