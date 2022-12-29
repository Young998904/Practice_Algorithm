package Programmers.Algorithm.BruteForce;
import java.util.Arrays;
//public class 모음사전 {
//    public static String[] alphabet = {"A", "E", "I", "O", "U"};
//    public static int answer = 0;
//    public static boolean go = true;
//
//    public static void main(String[] args) {
//        String word = "I";
//
//        String[] words = word.split("");
//        dfs (words, 0, new String[words.length]);
//
//        System.out.println(answer);
//
//    }
//    public static void dfs (String[] words, int depth, String[] output) {
//        while (go) {
//            if (depth == alphabet.length) { // 5
//                return;
//            }
//
//            if (depth >= words.length) { // 5
//                answer += 5;
//                dfs(words, depth + 1, output);
//                return;
//            }
//
//            for (int i = 0; i < 5; i++) {
//                if (!go) {return;}
//                output[depth] = alphabet[i];
//
//                answer++;
//
//                if (depth == words.length - 1 && Arrays.equals(words, output)) {
//                    go = false;
//                }
//
//                dfs(words, depth + 1, output);
//            }
//        }
//    }
//}

//public class 모음사전 {
//    public static String[] alphabet = {"A", "E", "I", "O", "U"};
//    public static int answer = 0;
//    public static boolean go = true;
//
//    public static void main(String[] args) {
//        String word = "AAU";
//
//        String[] words = word.split("");
//        dfs (words, 0, new String[words.length]);
//
//        System.out.println(answer);
//
//    }
//    public static void dfs (String[] words, int depth, String[] output) {
//        while (go) {
//            if (depth == alphabet.length) { // 5
//                return;
//            }
//
//            if (depth >= words.length) { // 5
//                answer += 5;
//                dfs(words, depth + 1, output);
//                return;
//            }
//
//            for (int i = 0; i < 5; i++) {
//                if (!go) {return;}
//                output[depth] = alphabet[i];
//
//                answer++;
//
//                if (depth == words.length - 1 && Arrays.equals(words, output)) {
//                    go = false;
//                }
//
//                dfs(words, depth + 1, output);
//            }
//        }
//    }
//}

public class 모음사전 {
    public static String[] alphabet = {"A", "E", "I", "O", "U"};
    public static int answer = 0;
    public static boolean go = true;

    public static void main(String[] args) {
        String word = "EIO";

        String[] words = word.split("");
        dfs (words, 0, new String[words.length]);

        System.out.println(answer);

    }
    public static void dfs (String[] words, int depth, String[] output) {
        if (depth == 5) {
            return;
        }
        for (int i=0; i<5; i++) {
            if (depth < words.length) {
                output[depth] = alphabet[i];
            }
            answer++;
            if (depth == words.length-1 && Arrays.equals(words, output)) {
                go = false;
                break;
            }
            dfs(words, depth+1, output);
            if (!go) {
                return;
            }
        }

    }
}