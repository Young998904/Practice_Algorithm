package Programmers.Step1;

class 문자열을_정수로_바꾸기 {

    public static void main(String[] args) {
        String s = "-1234";
        String str;

        int answer = 0;
        boolean isNegative = false;

        if (s.charAt(0) == '-') {
            str = s.substring(1);
            isNegative = true;
        }
        else if (s.charAt(0) == '+') {
            str = s.substring(1);
        }
        else {
            str = s;
        }

        answer = Integer.parseInt(str);

        if (isNegative) {
            System.out.println(answer * (-1));
            return;
        }

        System.out.println(answer);
    }
}