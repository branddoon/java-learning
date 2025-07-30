package com.lambda.streams.util;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExerciseLambda {

    /*
    * Return true if the stream contains at least one videogame with sales number more than 10
    * and not discount or its value more than 9.99. If not, return false
    * */
    public void executeExercise1(Stream<Videogame> stream){
        boolean r =  stream.filter( e -> e.getTotalSold() == 10)
                .anyMatch( e -> !e.getIsDiscount() || e.getPrice()> 9.99);
        System.out.println("Result: " + r);
    }

    /*
    * Return a stream with all XBOX console titles, during process print all results
    * ignore repetitive results
    *
    * */
    public void executeExercise2(Stream<Videogame> stream){
        //List<Videogame> r = stream.filter(e -> e.getConsole().equals(Console.XBOX)).sorted((a,b) -> a.getName().compareTo(b.getName())).distinct().toList();
        //r.forEach(System.out::println);
        List<Videogame> r = stream.filter(distinctByKey(Videogame::getName)).toList();
        r.forEach(System.out::println);

    }

    public <T>Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor){
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}
