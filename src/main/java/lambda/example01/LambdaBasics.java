package lambda.example01;

import lambda.example02.MyFunction;

import java.util.Comparator;

public class LambdaBasics {

    public static void main(String[] args) {

        //Anonymous implementation of Comparator Interface.
        //Single method interface.
        Comparator<String> stringComparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        System.out.println( stringComparator.compare("hello", "world") );

        //Using Lambda Expression
        Comparator<String> stringComparatorLambda =
                (String s1, String s2) -> {return s1.compareTo(s2); };
        System.out.println( stringComparatorLambda.compare("hello", "world") );

        //Lambda expression simplification:
        // 1- type inference
        // 2- return not required
        Comparator<String> stringComparatorLambdaSimple =
                (s1, s2) -> s1.compareTo(s2);
        System.out.println( stringComparatorLambdaSimple.compare("hello","world") );


        MyFunction myFunction = () -> System.out.println("Hello world!");
        myFunction.apply();

    }
}
