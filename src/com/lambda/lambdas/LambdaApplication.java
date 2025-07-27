package com.lambda.lambdas;

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
        System.out.println("----- 8. Function ------");
        FunctionApp functionApp = new FunctionApp();
        functionApp.execute();
        System.out.println("----- 9. BiFunction ------");
        BiFunctionApp biFunctionApp = new BiFunctionApp();
        biFunctionApp.execute();
        System.out.println("----- 10. Predicate ------");
        PredicateApp predicateApp = new PredicateApp();
        predicateApp.execute();
        System.out.println("----- 11. Bipredicate ------");
        BiPredicateApp biPredicateApp = new BiPredicateApp();
        biPredicateApp.execute();
        System.out.println("----- 12. Consumer ------");
        ConsumerApp consumerApp = new ConsumerApp();
        consumerApp.execute();
        System.out.println("----- 13. Supplier ------");
        SupplierApp supplierApp = new SupplierApp();
        supplierApp.execute();
        System.out.println("----- 14. Unary operator ------");
        UnaryOperatorApp unaryOperatorApp = new UnaryOperatorApp();
        unaryOperatorApp.execute();
        System.out.println("----- 15. Binary operator ------");
        BinaryOperatorApp binaryOperatorApp = new BinaryOperatorApp();
        binaryOperatorApp.execute();
    }
}
