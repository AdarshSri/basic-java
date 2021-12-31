package programming;

import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = addListUsingFunctional(numbers);
        System.out.println(sum);
    }

    private static int addListUsingFunctional(List<Integer> numbers) {
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }
}
