package com.lambda;

import com.lambda.lambdas.impl.*;

public class LambdaApplication {

    public static void main(String[] args){
        System.out.println("----- 1. Simple lambda -----");
        SimpleLambda simpleLambda = new SimpleLambda();
        simpleLambda.execute();
        System.out.println("----- 2. Generic lambda -----");
        GenericLambda genericLambda = new GenericLambda();
        genericLambda.execute();
        System.out.println("----- 3. Iterable lambda -----");
        IterableLambda iterableLambda = new IterableLambda();
        iterableLambda.execute();
        System.out.println("----- 4. Reference by object -----");
        ObjectMethodReference objectMethodReference = new ObjectMethodReference();
        objectMethodReference.execute();
        System.out.println("----- 5. Static reference ------");
        StaticMethodReference staticMethodReference = new StaticMethodReference();
        staticMethodReference.execute();
        System.out.println("----- 6. Constructor reference ------");
        ConstructorMethodReference constructorMethodReference = new ConstructorMethodReference();
        constructorMethodReference.execute();
        System.out.println("----- 7. Arbitrary reference ------");
        ArbitraryMethodReference arbitraryMethodReference = new ArbitraryMethodReference();
        arbitraryMethodReference.execute();

    }
}
