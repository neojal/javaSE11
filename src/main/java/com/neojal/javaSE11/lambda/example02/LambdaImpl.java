package com.neojal.javaSE11.lambda.example02;


/**
 * todo: finish comments, test javadoc.
 * Example of a class using Lambda Expressions used as an Instance of a Functional Interface.
 */
public class LambdaImpl {

    public static void main(String[] args) {

        // No params, empty parenthesis ().
        // Implementation in one line, no {} required.
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Hello world!");
        myFunctionalInterface.myAbstractMethod();

        //One param, text, no () required.
        MyFunctionalInterfaceWithParam myFunctionalInterfaceWithParam =
                text -> System.out.println("Hello "+ text);
        myFunctionalInterfaceWithParam.myAbstractMethod("World!");
        myFunctionalInterfaceWithParam.myDefaultMethod();

        //Two params, () required.
        MyFunctionalInterfaceWithParams myFunctionalInterfaceWithParams =
                (s1, s2) -> System.out.println(s1 +" "+s2);
        myFunctionalInterfaceWithParams.myAbstractMethod("Hello", "World!");
    }
}
