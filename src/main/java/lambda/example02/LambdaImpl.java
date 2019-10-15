package lambda.example02;

public class LambdaImpl {

    public static void main(String[] args) {

        MyFunction myFunction = () -> System.out.println("Hello world!");
        myFunction.apply();

        MyFunctionWithParam myFunctionWithParam =
                text -> System.out.println("Hello "+ text);
        myFunctionWithParam.apply("World!");

        MyFunctionWithParams myFunctionWithParams =
                (s1, s2) -> System.out.println(s1 +" "+s2);
        myFunctionWithParams.apply("Hello", "World!");
    }
}
