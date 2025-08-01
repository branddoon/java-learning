package com.lambda.util;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class BasicCar {
    private String name;
    private Double price;
    private Brand brand;
}
