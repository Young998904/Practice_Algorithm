package Programmers.Algorithm.Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 가장_큰_수 {
//    public static void main(String[] args) {
//        int[] numbers = {1, 0, 0, 1};
//        String answer = "";
//
//        // 기존 내 풀이
//        for (int i=1; i< numbers.length; i++) {
//            for (int j=0; j < numbers.length-i; j++) {
//                int a = Integer.parseInt(numbers[j] + String.valueOf(numbers[j+1]));
//                int b = Integer.parseInt(numbers[j + 1] + String.valueOf(numbers[j]));
//                if (a < b) {
//                    int temp = numbers[j+1];
//                    numbers[j+1] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//        }
//
//        for (int num : numbers) {
//            answer += String.valueOf(num);
//        }
//
//        System.out.println(answer);
//    }
//    public static void main(String[] args) {
//        String answer = "";
//
//        // 풀이 순서 : 숫자 배열 -> 문자 배열 -> 정렬 -> 문자열
//        int[] numbers = {6, 10, 2};
//
//        // (1) 숫자 배열 -> 문자 배열
//        String[] strNumbers = new String[numbers.length];
//
//        for (int i=0; i<numbers.length; i++) {
//            strNumbers[i] = "" + numbers[i];
//        }
//
////        // (2)-1 버블 정렬
////        for (int i=1; i<strNumbers.length; i++) {
////            for (int j=0; j<strNumbers.length-i; j++) {
////                String s1 = strNumbers[j];
////                String s2 = strNumbers[j+1];
////                if ((s1+s2).compareTo(s2+s1) < 0) {
////                    strNumbers[j+1] = s1;
////                    strNumbers[j] = s2;
////                }
////            }
////        }
//
////        // (2)-2 Comparator 활용
////        Arrays.sort(strNumbers, new Comparator<String>() {
////            public int compare(String o1, String o2) {
////                // return (o1+o2).compareTo(o2+o1); // 오름차순
////                return (o2+o1).compareTo(o1+o2); // 내림차순
////            }
////        });
//
//        // (2)-3 Comparator + 람다식 활용
//        Arrays.sort(strNumbers, ((o1, o2) -> (o2+o1).compareTo(o1+o2)));
//
//        // (3) 문자열
//        for (String str : strNumbers) {
//            answer += str;
//        }
//
//        System.out.println(answer);
//    }
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};

        String answer = IntStream.of(numbers)
            .mapToObj(n->String.valueOf(n))
            .sorted((s1,s2)->(s2+s1).compareTo(s1+s2))
            .collect(Collectors.joining());

        if (answer.startsWith("0")) answer = "0";

        System.out.println(answer);
    }
}
