package programming;

import java.util.List;
import java.util.function.BinaryOperator;

public class FunctionalProgramming {

    public static void main(String[] args) {
        printSumInListFunctional(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }


    private static void printSumInListFunctional(List<Integer> numbers) {
        BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        int sum = numbers.stream().reduce(0, bo);
        System.out.println(sum);
    }

    private static void print(Integer number) {
        System.out.println(number);
    }
}
