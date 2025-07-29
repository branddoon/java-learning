package com.lambda.lambdas.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private Long id;
    private String name;
    private Double price;
}
