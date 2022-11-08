package Programmers.Step2;

import java.util.StringTokenizer;

public class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        String s = "for the last week";
        String answer = "";

//        // 방법 (1) : 런타임 에러 발생 & 맨 뒤 부분에 공백이 있을 경우에 대한 처리 미흡
//        String[] strList = s.split(" ");
//
//        for (int i=0; i<strList.length; i++ ) {
//            strList[i] = strList[i].trim();
//            String end = strList[i].substring(1).toLowerCase();
//            String start = strList[i].substring(0, 1).toUpperCase();
//            strList[i] = start + end;
//        }
//
//        for (String str : strList) {
//            answer += str + " ";
//        }
//
//        System.out.println(answer);

        // 방법 (2) : String Tokenizer 사용
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();
        int upperCase = 'A' - 'a';

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (str.equals(" ")) {
                sb.append(str);
                continue;
            }
            char c = str.charAt(0);
            if (c >= 'a' && c <= 'z') {
                sb.append((char) (c + upperCase));
            }
            else sb.append(c);
            str = str.toLowerCase();
            for (int i=1; i<str.length(); i++) {
                sb.append(str.charAt(i));
            }
        }

        answer = sb.toString();
        System.out.println(answer);
        // 방법 (1) 과 방법 (2) 속도 거의 100배 차이남
    }
}
