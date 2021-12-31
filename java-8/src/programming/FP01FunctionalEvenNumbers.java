package programming;

import java.util.List;

public class FP01FunctionalEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printEvenNumbersInListFunctional(numbers);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    }

}
