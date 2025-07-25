package com.lambda.lambdas.impl;

import java.util.List;

public class IterableLambda {

    public void execute(){
        List<String> singers = List.of("Michael Jackson", "Celine Dion", "Freddy Mercury", "Shakira");
        singers.forEach((e)->System.out.println(e));
    }
}
