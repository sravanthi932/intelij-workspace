package basic_programming;

import java.util.*;

public class SortStringArrayWithLocalClass {
    public static void main(String[] args) {
//        String[] stringArray = {"sravanthi", "naveen", "hethvik"};
//        class StringSort implements Comparator<String>{
//            @Override
//            public int compare(String a, String b) {
//                return a.compareTo(b) ;
//            }
//        }
//        Arrays.sort(stringArray, new StringSort());
//        for (String str : stringArray){
//            System.out.println(str + " ");
//        }

        String[] stringArray = { "kanna", "chinnu", "ammu"};
//        Arrays.sort(stringArray, (String a, String b) -> {
//            return a.compareTo(b);
//        });
//        for (String str : stringArray){
//            System.out.println(str + "");
//        }
        List<String> stringList = Arrays.asList(stringArray);
        Collections.sort(stringList, (a, b) -> a.compareTo(b) );
        System.out.println(stringList);

    }


}

