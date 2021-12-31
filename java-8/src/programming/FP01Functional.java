package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(FP01Functional::print);
    }

    private static void print(Integer number) {
        System.out.println(number);
    }
}
