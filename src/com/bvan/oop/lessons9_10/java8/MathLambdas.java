package com.bvan.oop.lessons9_10.java8;

public class MathLambdas {

    public static void main(String[] args) {
        MathOperation<Integer> sum = (a, b) -> a + b;
        MathOperation<Long> mult = (Long x, Long y) -> x * y;

        MathUnaryOperation<Integer> inc = x -> x + 1;
        MathUnaryOperation<Long> dec = (Long a) -> a - 1;

        MathUnaryOperation<Double> sin = Math::sin; // x -> Math.sin(x)

        System.out.println(sum.apply(10, 20)); // 30
        System.out.println(inc.apply(50)); // 51
        System.out.println(sin.apply(1.0));
    }
}

// (T, T) -> T
interface MathOperation<T> {

    T apply(T x, T y);
}

// T -> T
interface MathUnaryOperation<T> {

    T apply(T x);
}
