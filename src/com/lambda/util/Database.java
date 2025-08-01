package com.lambda.util;

import java.util.Collections;
import java.util.List;

public class Database {

    public static List<Car> cars;

    static {
        cars = List.of(
                Car.builder()
                        .name("Nissan Sentra")
                        .price(300000.0)
                        .brand(Brand.NISSAN)
                        .reviews(List.of(
                                new Review("I have face some issues with automatic transmission", 1),
                                new Review("Expensive", 3),
                                new Review("Ideal for family", 5)
                        ))
                        .officialWebsite("www.nissan.com")
                        .isDiscount(false)
                        .totalSold(74)
                        .build(),
                Car.builder()
                        .name("Nissan Versa")
                        .price(300000.0)
                        .brand(Brand.NISSAN)
                        .reviews(List.of(
                                new Review("It's ok for work", 5),
                                new Review("Not aesthetic", 3),
                                new Review("Ideal for family", 5)
                        ))
                        .officialWebsite("www.nissan.com")
                        .isDiscount(false)
                        .totalSold(34)
                        .build(),
                Car.builder()
                        .name("Nissan Kicks")
                        .price(500000.0)
                        .brand(Brand.NISSAN)
                        .reviews(List.of(
                                new Review("Good car", 5),
                                new Review("Good", 4),
                                new Review("Ideal for family", 5)
                        ))
                        .officialWebsite("www.nissan.com")
                        .isDiscount(false)
                        .totalSold(54)
                        .build(),
                Car.builder()
                        .name("Golf")
                        .price(200000.0)
                        .brand(Brand.VW)
                        .reviews(List.of(
                                new Review("Too small car", 1),
                                new Review("It works", 3),
                                new Review("Individual use", 5)
                        ))
                        .officialWebsite("www.vw.com")
                        .isDiscount(false)
                        .totalSold(23)
                        .build(),
                Car.builder()
                        .name("Vento")
                        .price(400000.0)
                        .brand(Brand.VW)
                        .reviews(List.of(
                                new Review("Familiar", 5),
                                new Review("It works", 5),
                                new Review("Good machine", 5)
                        ))
                        .officialWebsite("www.vw.com")
                        .isDiscount(false)
                        .totalSold(5)
                        .build(),
                Car.builder()
                        .name("Jetta")
                        .price(300000.0)
                        .brand(Brand.VW)
                        .reviews(List.of(
                                new Review("Classic", 1),
                                new Review("Not for long travel", 2),
                                new Review("It has comfort", 5)
                        ))
                        .officialWebsite("www.vw.com")
                        .isDiscount(false)
                        .totalSold(15)
                        .build(),
                Car.builder()
                        .name("Soul")
                        .price(500000.0)
                        .brand(Brand.KIA)
                        .reviews(List.of(
                                new Review("Good", 5),
                                new Review("A dream", 5)
                        ))
                        .officialWebsite("www.kia.com")
                        .isDiscount(false)
                        .totalSold(199)
                        .build(),
                Car.builder()
                        .name("Forte")
                        .price(400000.0)
                        .brand(Brand.KIA)
                        .reviews(Collections.emptyList())
                        .officialWebsite("www.kia.com")
                        .isDiscount(false)
                        .totalSold(10)
                        .build(),
                Car.builder()
                        .name("Rio")
                        .price(300000.0)
                        .brand(Brand.KIA)
                        .reviews(List.of(
                                new Review("Good", 5),
                                new Review("A dream", 5)
                        ))
                        .officialWebsite("www.kia.com")
                        .isDiscount(false)
                        .totalSold(199)
                        .build(),
                Car.builder()
                        .name("Tesla")
                        .price(28.00)
                        .brand(Brand.TESLA)
                        .reviews(List.of(
                                new Review("Magic", 5),
                                new Review("Dream come true", 5),
                                new Review("It is the best on the market", 5)
                        ))
                        .officialWebsite("www.tesla.com")
                        .isDiscount(false)
                        .totalSold(79)
                        .build(),
                Car.builder()
                        .name("Yaris")
                        .price(300000.0)
                        .brand(Brand.TOYOTA)
                        .reviews(List.of(new Review("Is the best", 5)))
                        .officialWebsite("www.toyota.com")
                        .isDiscount(false)
                        .totalSold(14)
                        .build(),
                Car.builder()
                        .name("Corolla")
                        .price(400000.0)
                        .brand(Brand.TOYOTA)
                        .reviews(List.of(new Review("Is the best", 5)))
                        .officialWebsite("www.toyota.com")
                        .isDiscount(false)
                        .totalSold(16)
                        .build(),
                Car.builder()
                        .name("Hilux")
                        .price(500000.0)
                        .brand(Brand.TOYOTA)
                        .reviews(List.of(new Review("Is the best", 5)))
                        .officialWebsite("www.toyota.com")
                        .isDiscount(false)
                        .totalSold(17)
                        .build(),
                Car.builder()
                        .name("Kwid")
                        .price(247000.0)
                        .brand(Brand.RENAULT)
                        .reviews(Collections.emptyList())
                        .officialWebsite("www.renault.com")
                        .isDiscount(false)
                        .totalSold(19)
                        .build(),
                Car.builder()
                        .name("Kardian")
                        .price(370000.0)
                        .brand(Brand.RENAULT)
                        .reviews(Collections.emptyList())
                        .officialWebsite("www.renault.com")
                        .isDiscount(false)
                        .totalSold(29)
                        .build(),
                Car.builder()
                        .name("Duster")
                        .price(388000.0)
                        .brand(Brand.RENAULT)
                        .reviews(Collections.emptyList())
                        .officialWebsite("www.renault.com")
                        .isDiscount(false)
                        .totalSold(29)
                        .build(),
                Car.builder()
                        .name("Alsvin")
                        .price(249000.0)
                        .brand(Brand.CHANGAN)
                        .reviews(List.of(new Review("4 Stars", 4)))
                        .officialWebsite("www.changan.com")
                        .isDiscount(false)
                        .totalSold(1200)
                        .build(),
                Car.builder()
                        .name("Hunter")
                        .price(500000.0)
                        .brand(Brand.CHANGAN)
                        .reviews(List.of(
                                new Review("Amazing", 5),
                                new Review("It works as expected", 5)))
                        .officialWebsite("www.changan.com")
                        .isDiscount(true)
                        .totalSold(2000)
                        .build(),
                Car.builder()
                        .name("Nissan Sentra")
                        .price(300000.0)
                        .brand(Brand.NISSAN)
                        .reviews(List.of(
                                new Review("I have face some issues with automatic transmission", 1),
                                new Review("Expensive", 3),
                                new Review("Ideal for family", 5)
                        ))
                        .officialWebsite("www.nissan.com")
                        .isDiscount(false)
                        .totalSold(74)
                        .build(),
                Car.builder()
                        .name("MG3")
                        .price(300000.0)
                        .brand(Brand.MG)
                        .reviews(List.of(
                                new Review("It's the best", 5),
                                new Review("Good", 4)
                        ))
                        .officialWebsite("www.mg.com")
                        .isDiscount(false)
                        .totalSold(74)
                        .build()
        );
    }
}
