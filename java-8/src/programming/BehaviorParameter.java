package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviorParameter {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printSquareInListFunctional(numbers, x -> x * x);
    }


    private static void printSquareInListFunctional(List<Integer> numbers, Function<Integer, Integer> squareFun) {
        List<Integer> square = numbers.stream().map(squareFun).collect(Collectors.toList());
        System.out.println(square);
    }

    private static void print(Integer number) {
        System.out.println(number);
    }
}
