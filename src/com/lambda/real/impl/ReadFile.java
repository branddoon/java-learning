package com.lambda.real.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

    public void execute(){
        Path file = Paths.get("src/resources/lambdas.txt");
        try(Stream<String> lines = Files.lines(file).onClose(() -> System.out.println("Closing reader"))){
            lines.forEach((e) -> System.out.println(e));
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
