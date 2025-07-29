package com.lambda.streams.impl;

import com.lambda.streams.util.Videogame;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFinalOperators {

    public void executeCount(Stream<Videogame> stream){
        System.out.println("Result: " + stream.count());
    }

    public void executeAnyMatch(Stream<Videogame> stream){
        boolean r = stream.anyMatch( v -> v.getTotalSold() > 1);
        System.out.println("Result: " + r);
    }

    public void executeAllMatch(Stream<Videogame> stream){
        boolean r = stream.allMatch( v -> v.getTotalSold() > 150);
        System.out.println("Result: " + r);
    }

    public void executeNonMatch(Stream<Videogame> stream){
        boolean r = stream.noneMatch( Videogame::getIsDiscount);
        System.out.println("Result: " + r);
    }

    public void executeFindFirst(Stream<Videogame> stream){
        Optional<Videogame> r = stream.findFirst();
        System.out.println(r);
    }

    public void executeAnyOperator(Stream<Videogame> stream){
        Optional<Videogame> r = stream.findAny();
        System.out.println(r);
    }

    public void executeReduceOperator(Stream<Videogame> stream){
        Optional<Integer> r = stream.filter(Videogame::getIsDiscount)
                .map(Videogame::getTotalSold)
                .reduce(Integer::sum);
        System.out.println(r);
    }

    public void executeMaxOperator(Stream<Videogame> stream){
        Optional<Videogame> r = stream.max((a,b) -> a.getName().compareTo(b.getName()));
        System.out.println(r.get().getName());
    }

    public void executeMinOperator(Stream<Videogame> stream){
        Optional<Videogame> r = stream.min((a,b) -> a.getName().compareTo(b.getName()));
        System.out.println(r.get().getName());
    }

}
