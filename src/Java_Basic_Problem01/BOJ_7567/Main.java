package Java_Basic_Problem01.BOJ_7567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int height = 0;
        Boolean upset = false;

        // 첫 그릇 상태 확인
        if(input.charAt(0) == '(') {
            height += 10;
        }
        else if(input.charAt(0) == ')') {
            height += 10;
            upset = true;
        }

        // 두번째 그릇부터 마지막 그릇까지 확인
        for(int i = 1; i < input.length(); i++) {
            if(upset == false) {
                if(input.charAt(i) == '(') {
                    height += 5;
                }
                else {
                    height += 10;
                    upset = true;
                }
            }
            else {
                if(input.charAt(i) == '(') {
                    height += 10;
                    upset = false;
                }
                else {
                    height += 5;
                }
            }
        }

        System.out.println(height);
    }
}
