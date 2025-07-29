package com.lambda.streams.util;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class BasicVideogame {
    private String name;
    private Double price;
    private Console console;
}
