package basic_programming;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListInStreams {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("sravanthi");
        stringList.add("naveen");
        stringList.add("hethvik");
        stringList.add("hethu");
        stringList.add("sravs");
        stringList.add("navi");
        stringList.add("snh");

        System.out.println("use stream for filtering and display");
        stringList.stream()
                .filter(s -> s.startsWith("s"))
                .forEach(System.out::println);

        System.out.println("use stream for filtering , sorting and display");
        stringList.stream()
                .filter(s -> s.startsWith("n"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("Use stream for filtering, sorting in descending and displaying");
        stringList.stream()
                .filter(s -> s.startsWith("n"))
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        System.out.println("Use stream for filtering, uppercase conversion and displaying");
        stringList.stream()
                .filter(s -> s.startsWith("s"))
                .map(String :: toUpperCase)
                .sorted()
                .forEach(System.out::println);

        boolean anyRecordStartsWithS = stringList.stream()
                .anyMatch((s -> s.startsWith("s")));
        System.out.println(anyRecordStartsWithS);

        boolean allRecordsStartsWithS = stringList.stream()
                .allMatch((s -> s.startsWith("s")));
        System.out.println(allRecordsStartsWithS);

        boolean nonRecordsStartsWithC = stringList.stream()
                .noneMatch((s -> s.startsWith("c")));
        System.out.println(nonRecordsStartsWithC);

        long countRecordsStartsWithS = stringList.stream().
                filter((s -> s.startsWith("s"))).count();
        System.out.println(countRecordsStartsWithS);

    }
}
