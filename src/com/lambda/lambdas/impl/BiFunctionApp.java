package com.lambda.lambdas.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionApp {

    private static <T,U,R> List<R> listCombiner (
            List<T> list1,
            List<U> list2,
            BiFunction<T,U,R> combiner
    ){

        List<R> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++){
            result.add(combiner.apply(list1.get(i), list2.get(i)));
        }
        return result;
    };

    public void execute(){
        List<String> list1 = Arrays.asList("a","b","c");
        List<Integer> list2 = Arrays.asList(1,2,3);

        List<String> result = listCombiner(list1, list2, (l1, l2) -> l1 + l2);
        System.out.println("List result: "+ result);
    }
}
