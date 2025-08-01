package com.lambda.streams;

import com.lambda.streams.impl.ConstructorStream;
import com.lambda.streams.impl.StreamFinalOperator;
import com.lambda.streams.impl.StreamIntermediateOperator;
import com.lambda.util.Database;
import com.lambda.streams.impl.ExerciseLambda;

public class StreamApp {

    public static void main(String[] args){
        System.out.println("1. Constructor stream");
        ConstructorStream constructorStream = new ConstructorStream();
        constructorStream.execute();
        System.out.println("2. Count");
        StreamFinalOperator streamFinalOperator = new StreamFinalOperator();
        streamFinalOperator.executeCount(Database.cars.stream());
        System.out.println("3. Any match");
        streamFinalOperator.executeAnyMatch(Database.cars.stream());
        System.out.println("4. All match");
        streamFinalOperator.executeAllMatch(Database.cars.stream());
        System.out.println("5. None match");
        streamFinalOperator.executeNonMatch(Database.cars.stream());
        System.out.println("6. Find first");
        streamFinalOperator.executeFindFirst(Database.cars.stream());
        System.out.println("7. Find any");
        streamFinalOperator.executeAnyOperator(Database.cars.stream());
        System.out.println("8. Reduce");
        streamFinalOperator.executeReduceOperator(Database.cars.stream());
        System.out.println("9. Max");
        streamFinalOperator.executeMaxOperator(Database.cars.stream());
        System.out.println("10. Min");
        streamFinalOperator.executeMinOperator(Database.cars.stream());
        System.out.println("------------------------------------------------");
        System.out.println("1. Distinct");
        StreamIntermediateOperator streamIntermediateOperator = new StreamIntermediateOperator();
        streamIntermediateOperator.executeDistinct(Database.cars.stream());
        System.out.println("2. Limit");
        streamIntermediateOperator.executeLimit(Database.cars.stream());
        System.out.println("3. Skip");
        streamIntermediateOperator.executeSkip(Database.cars.stream());
        System.out.println("4. Filter");
        streamIntermediateOperator.executeFilter(Database.cars.stream());
        System.out.println("5. Map");
        streamIntermediateOperator.executeMap(Database.cars.stream());
        System.out.println("6. FlatMap");
        streamIntermediateOperator.executeFlatMap(Database.cars.stream());
        System.out.println("7. Flat or map?");
        streamIntermediateOperator.moreMapAndFlatMap(Database.cars.stream());
        System.out.println("8. Peek");
        streamIntermediateOperator.executePeek(Database.cars.stream());
        System.out.println("9. Sort");
        streamIntermediateOperator.executeSort(Database.cars.stream());
        System.out.println("10. Take while");
        streamIntermediateOperator.executeTakeWhile(Database.cars.stream());
        System.out.println("11. Drop while");
        streamIntermediateOperator.executeDropWhile(Database.cars.stream());
        System.out.println("------------------------------------------------");
        System.out.println("Exercise 1");
        ExerciseLambda exerciseLambda = new ExerciseLambda();
        exerciseLambda.executeExercise1(Database.cars.stream());
        System.out.println("Exercise 2");
        exerciseLambda.executeExercise2(Database.cars.stream());
        System.out.println("Exercise 3");
        exerciseLambda.executeExercise3(Database.cars.stream());
        System.out.println("Exercise 4");
        exerciseLambda.executeExercise4(Database.cars.stream());
        System.out.println("Exercise 5");
        exerciseLambda.executeExercise5(Database.cars.stream());
    }
}
