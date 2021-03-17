package BOJ_10988;

import java.util.Scanner;

public class BestAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // StringBuffer 클래스의 reverse() 메소드 사용하기
        String inputCompare = new StringBuffer(input).reverse().toString();
        System.out.println(input.equals(inputCompare)? 1 : 0);
    }
}
