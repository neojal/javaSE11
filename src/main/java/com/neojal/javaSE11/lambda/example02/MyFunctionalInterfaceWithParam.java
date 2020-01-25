package com.neojal.javaSE11.lambda.example02;

/**
 * @FunctionalInterface checks at compilation time that there is only one abstract method.
 */
@FunctionalInterface
public interface MyFunctionalInterfaceWithParam {

    void myAbstractMethod(String s1);

    /**
    * Default Methods: methods with implementation in an interface, default keyword required.
    */
    default void myDefaultMethod() {

        System.out.println("Hello from a Default Method in an Interface.");
    }
}
