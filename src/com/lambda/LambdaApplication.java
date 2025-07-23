package com.lambda;

import com.lambda.lambdas.GenericLambda;
import com.lambda.lambdas.SimpleLambda;

public class LambdaApplication {

    public static void main(String[] args){
        System.out.println("----- 1. Simple lambda -----");
        SimpleLambda simpleLambda = new SimpleLambda();
        simpleLambda.execute();
        System.out.println("----- 2. Generic lambda -----");
        GenericLambda genericLambda = new GenericLambda();
        genericLambda.execute();

    }
}
