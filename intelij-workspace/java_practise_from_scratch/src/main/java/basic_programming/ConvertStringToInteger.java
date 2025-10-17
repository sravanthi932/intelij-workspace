package basic_programming;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        StringToIntegerInterface<Integer, String> intVal = (stringVal -> Integer.valueOf(stringVal));
        Integer result = intVal.convertStringToIntegerMethod("5");
        System.out.println(result);
    }
}
