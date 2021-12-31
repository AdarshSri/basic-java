package programming;

import java.util.List;

public class FP02FunctionalSquareNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printSquareNumbersInListFunctional(numbers);
//        printCubeOfOddNumbersInListFunctional(numbers);
    }

    private static void printSquareNumbersInListFunctional(List<Integer> numbers) {
        int sum = numbers.stream().map(num -> num * num).reduce(0, (x, y) -> x + y);
        System.out.println("sum - " + sum);
    }

    private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(num -> num % 2 == 1).map(num -> num * num * num).forEach(System.out::println);
    }

}
