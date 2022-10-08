package BaekJoon.Step.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 방법 1 (BufferedReader 사용) : 25752kb	508ms
public class Baek25501 {
    static int cnt= 0;
    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt(br.readLine());

        for (int i=1; i<=N; i++) {
            String str = br.readLine();

            int p = isPalindrome(str);

            System.out.printf("%d %d\n", p, cnt);
            cnt = 0;
        }
    }
}

//// 방법 2 (Scanner 사용) : 26752kb	544ms
//import java.util.Scanner;
//
//public class Baek25501{
//    public static int recursion(String s, int l, int r, int count){
//        count++;
//        if(l >= r) { System.out.print("1 "); return count; }
//        else if(s.charAt(l) != s.charAt(r)) { System.out.print("0 "); return count; }
//        else return recursion(s, l+1, r-1, count);
//    }
//
//    public static int isPalindrome(String s, int count){
//        return recursion(s, 0, s.length()-1, count);
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int t = Integer.parseInt(sc.nextLine());
//        for(int i = 0; i < t; i++) {
//            int count = 0;
//            String s = sc.nextLine();
//            System.out.print(isPalindrome(s, count));
//            System.out.println();
//        }
//    }
//}

/*
Input :
5
AAA
ABBA
ABABA
ABCA
PALINDROME

Output :
1 2
1 3
1 3
0 2
0 1
*/