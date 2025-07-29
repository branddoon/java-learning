package com.lambda.lambdas.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Employee {
    private String dni;
    private String name;
    private Double salary;
}
