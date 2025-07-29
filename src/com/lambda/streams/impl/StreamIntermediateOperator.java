package com.lambda.streams.impl;

import com.lambda.streams.util.BasicVideogame;
import com.lambda.streams.util.Review;
import com.lambda.streams.util.Videogame;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperator {

    public void executeDistinct(Stream<Videogame> stream){
        System.out.println(stream.distinct().count());
    }

    public void executeLimit(Stream<Videogame> stream){
        List<Videogame > r = stream.limit(5).toList();
        r.forEach(System.out::println);
    }

    public void executeSkip(Stream<Videogame> stream){
        List<Videogame > r = stream.skip(19).toList();
        r.forEach(System.out::println);
    }

    public void executeFilter(Stream<Videogame> stream){
        List<Videogame> r = stream.filter(v -> v.getPrice() > 12.0)
                .filter( v -> !v.getIsDiscount())
                .filter(v -> v.getOfficialWebsite().contains("forza"))
                .toList();
        r.forEach(System.out::println);
    }

    public void executeMap(Stream<Videogame> stream){
        List<BasicVideogame> r = stream
                .map( v -> BasicVideogame.builder()
                        .name(v.getName())
                        .price(v.getPrice())
                        .console(v.getConsole())
                        .build()).toList();
        System.out.println("-------Basic video games-------");
        r.forEach(System.out::println);
        List<String> titles = r.stream().map(BasicVideogame::getName).toList();
        System.out.println("-----Titles------");
        titles.forEach(System.out::println);
    }

    public void executeFlatMap(Stream<Videogame> stream){
        var r = stream.flatMap( v -> v.getReviews().stream()).toList();
        System.out.println(r);
    }

    public void moreMapAndFlatMap(Stream<Videogame> stream){
        //var totalReviews = stream.map( v -> v.getReviews().stream()).count()
        //var totalReviews = stream.flatMap(v -> v.getReviews().stream()).count();
        var totalReviews = stream.mapToLong(v -> v.getReviews().size()).sum();
        System.out.println(totalReviews);
    }

    public void executePeek(Stream<Videogame> stream){
        //stream.peek( v -> v.setName("")).forEach(System.out::println);
    }

    public void executeSort(Stream<Videogame> stream){
        List<Videogame> listSorted = stream
                .sorted( Comparator.comparingInt(v -> v.getReviews().size()))
                .toList();
        listSorted.forEach(System.out::println);
    }

    public void executeTakeWhile(Stream<Videogame> stream){
        List<Videogame> listSorted = stream
                .sorted(Comparator.comparing(Videogame::getName))
                .takeWhile( v -> !v.getName().startsWith("M"))
                .toList();
        listSorted.forEach(System.out::println);
    }

    public void executeDropWhile(Stream<Videogame> stream){
        List<Videogame> listSorted = stream
                .sorted(Comparator.comparing(Videogame::getName))
                .dropWhile( v -> !v.getName().startsWith("M"))
                .toList();
        listSorted.forEach(System.out::println);

    }
}
