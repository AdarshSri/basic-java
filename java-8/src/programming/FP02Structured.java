package programming;

import java.util.List;

public class FP02Structured {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = addListUsingStructure(numbers);
        System.out.println(sum);
    }

    private static int addListUsingStructure(List<Integer> numbers) {
        int sum = 0;
        for (Integer in : numbers) {
            sum += in;
        }
        return sum;
    }
}
