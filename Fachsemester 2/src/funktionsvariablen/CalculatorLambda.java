package funktionsvariablen;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
public class CalculatorLambda {
public static void main(String... args) {
IntBinaryOperator addition = (a, b)
-> a + b;
IntBinaryOperator subtraction = (a, b) -> a -
b;
IntBinaryOperator division = (a, b) -> a / b;
IntBinaryOperator multiplication = (a, b) -> a*b;
IntFunction inc = a -> a+1;
IntFunction dec = a -> a-1;
System.out.println("40 + 2 = " +
addition.applyAsInt(40, 2));
System.out.println("20 - 10 = " +
subtraction.applyAsInt(20, 10));

System.out.println("inc(20) = "+ inc.apply(20));
System.out.println("dec(20) = "+ dec.apply(20));
System.out.println("20 / 4 = "+ division.applyAsInt(20, 4));
System.out.println("20 * 5 = "+multiplication.applyAsInt(20, 5));
}



}

