package com.lambda.streams;

import com.lambda.streams.impl.*;
import com.lambda.util.Database;

public class CollectorApp {

    public static void main(String [] args){
        System.out.println("1. Collectors");
        CollectorToCollection collectorToCollection = new CollectorToCollection();
        collectorToCollection.execute(Database.cars.stream(), "MAP");
        System.out.println("2. Partition");
        CollectionPartition collectionPartition = new CollectionPartition();
        collectionPartition.execute(Database.cars.stream());
        System.out.println("3. Group by");
        CollectionGroupBy collectionGroupBy = new CollectionGroupBy();
        collectionGroupBy.executeGroupBy(Database.cars.stream());
        System.out.println("4. Group by sum");
        collectionGroupBy.executeGroupBySum(Database.cars.stream());
        System.out.println("5. Average");
        CollectionReduceFunction collectionReduceFunction = new CollectionReduceFunction();
        collectionReduceFunction.executeAvg(Database.cars.stream());
        System.out.println("6. Summarizing Int");
        collectionReduceFunction.executeSummarizingInt(Database.cars.stream());
        System.out.println("7. Join");
        collectionReduceFunction.executeJoin(Database.cars.stream());
        System.out.println("------------------------------------------------");
        System.out.println("Exercise 1");
        ExerciseCollector exerciseCollector = new ExerciseCollector();
        exerciseCollector.executeExercise1(Database.cars.stream());
        System.out.println("Exercise 2");
        exerciseCollector.executeExercise2(Database.cars.stream());
        System.out.println("Exercise 3");
        exerciseCollector.executeExercise3(Database.cars.stream());
    }
}
