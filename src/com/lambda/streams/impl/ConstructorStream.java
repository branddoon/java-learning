package com.lambda.streams.impl;

import com.lambda.streams.util.Database;
import com.lambda.streams.util.Videogame;

import java.util.stream.Stream;

public class ConstructorStream {

    public void execute(){
        Stream<Videogame> myStream = Database.videogames.stream();
        myStream.forEach( System.out::println);

    }
}
