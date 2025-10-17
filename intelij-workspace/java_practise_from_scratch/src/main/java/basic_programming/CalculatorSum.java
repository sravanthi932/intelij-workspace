package basic_programming;

public class CalculatorSum {
    public static void main(String[] args) {
        CalculatorInterface<Integer> sum = (Integer val1, Integer val2) -> {
            return val2 + val1;
        };
        Integer result = sum.sumMethod(2, 5);
        System.out.println(result);
    }
}
