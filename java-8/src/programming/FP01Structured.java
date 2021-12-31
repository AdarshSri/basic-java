package programming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (Integer in : numbers) {
            System.out.println(in);
        }
    }
}
