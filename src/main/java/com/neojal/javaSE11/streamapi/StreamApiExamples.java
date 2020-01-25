package com.neojal.javaSE11.streamapi;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExamples {

    /**
     *
     * @param numbers
     * @return each number plus one using map operation
     */
    public static List<Integer> numbersPlusOne(List<Integer> numbers) {

        return numbers.stream().map(x->x+1).collect(Collectors.toList() );
    }

    /**
     *
     * @param numbers
     * @return max number in the list
     */
    public static int maxNumber(List<Integer> numbers) {

        return numbers.stream().reduce(0, Integer::max);
    }

    /**
     *
     * @param numbers
     * @return min number in the list
     */
    public static int minNumber(List<Integer> numbers) {

        return numbers.stream().reduce(1000000, Integer::min);
    }

    /**
     *
     * @param repeatedNames
     * @return names not repeated
     */
    public static Set<String> filterRepeatedNames(List<String> repeatedNames) {

        return repeatedNames.stream().collect(Collectors.toSet());
    }

    /**
     *
     * @param numbers
     * @return sum on numbers in list
     */
    public static int sumIntegers(List<Integer> numbers) {

        return numbers.stream().reduce(0, (sum, number)->sum+number);
        //return numbers.stream().mapToInt(number->number.intValue()).sum();
    }

    /**
     *
     * @param number
     * @return factorial of number
     */
    public static int factorial(int number) {
        Stream.iterate(1, (Integer n)->n+1).limit(number).forEach(System.out::println);
        return Stream.iterate(1, (Integer n)->n+1).limit(number).reduce(1, (factorial, n)->factorial*n);
    }
}
