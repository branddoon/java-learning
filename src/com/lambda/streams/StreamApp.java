package com.lambda.streams;

import com.lambda.streams.impl.ConstructorStream;
import com.lambda.streams.impl.StreamFinalOperators;
import com.lambda.streams.impl.StreamIntermediateOperator;
import com.lambda.streams.util.Database;
import com.lambda.streams.util.ExerciseLambda;

public class StreamApp {

    public static void main(String[] args){
        System.out.println("1. Constructor stream");
        ConstructorStream constructorStream = new ConstructorStream();
        constructorStream.execute();
        System.out.println("2. Count");
        StreamFinalOperators streamFinalOperators = new StreamFinalOperators();
        streamFinalOperators.executeCount(Database.videogames.stream());
        System.out.println("3. Any match");
        streamFinalOperators.executeAnyMatch(Database.videogames.stream());
        System.out.println("4. All match");
        streamFinalOperators.executeAllMatch(Database.videogames.stream());
        System.out.println("5. None match");
        streamFinalOperators.executeNonMatch(Database.videogames.stream());
        System.out.println("6. Find first");
        streamFinalOperators.executeFindFirst(Database.videogames.stream());
        System.out.println("7. Find any");
        streamFinalOperators.executeAnyOperator(Database.videogames.stream());
        System.out.println("8. Reduce");
        streamFinalOperators.executeReduceOperator(Database.videogames.stream());
        System.out.println("9. Max");
        streamFinalOperators.executeMaxOperator(Database.videogames.stream());
        System.out.println("10. Min");
        streamFinalOperators.executeMinOperator(Database.videogames.stream());
        System.out.println("------------------------------------------------");
        System.out.println("1. Distinct");
        StreamIntermediateOperator streamIntermediateOperator = new StreamIntermediateOperator();
        streamIntermediateOperator.executeDistinct(Database.videogames.stream());
        System.out.println("2. Limit");
        streamIntermediateOperator.executeLimit(Database.videogames.stream());
        System.out.println("3. Skip");
        streamIntermediateOperator.executeSkip(Database.videogames.stream());
        System.out.println("4. Filter");
        streamIntermediateOperator.executeFilter(Database.videogames.stream());
        System.out.println("5. Map");
        streamIntermediateOperator.executeMap(Database.videogames.stream());
        System.out.println("6. FlatMap");
        streamIntermediateOperator.executeFlatMap(Database.videogames.stream());
        System.out.println("7. Flat or map?");
        streamIntermediateOperator.moreMapAndFlatMap(Database.videogames.stream());
        System.out.println("8. Peek");
        streamIntermediateOperator.executePeek(Database.videogames.stream());
        System.out.println("9. Sort");
        streamIntermediateOperator.executeSort(Database.videogames.stream());
        System.out.println("10. Take while");
        streamIntermediateOperator.executeTakeWhile(Database.videogames.stream());
        System.out.println("11. Drop while");
        streamIntermediateOperator.executeDropWhile(Database.videogames.stream());
        System.out.println("------------------------------------------------");
        System.out.println("Exercise 1");
        ExerciseLambda exerciseLambda = new ExerciseLambda();
        exerciseLambda.executeExercise1(Database.videogames.stream());
        System.out.println("Exercise 2");
        exerciseLambda.executeExercise2(Database.videogames.stream());
        System.out.println("Exercise 3");
        exerciseLambda.executeExercise3(Database.videogames.stream());
        System.out.println("Exercise 4");
        exerciseLambda.executeExercise4(Database.videogames.stream());
        System.out.println("Exercise 5");
        exerciseLambda.executeExercise5(Database.videogames.stream());
    }
}
