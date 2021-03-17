package Java_Basic_Problem01.BOJ_3009;

import java.util.Scanner;

public class BestAnswer {
//    // 반복문 사용
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] input = {{sc.nextInt(), sc.nextInt()}, {sc.nextInt(), sc.nextInt()}, {sc.nextInt(), sc.nextInt()}};
//        int[] answer = new int[2];
//
//        for(int i = 0; i < answer.length; i++) {
//            if(input[0][i] == input[1][i]) {
//                answer[i] = input[2][i];
//            }
//            else if(input[0][i] == input[2][i]) {
//                answer[i] = input[1][i];
//            }
//            else if(input[1][i] == input[2][i]) {
//                answer[i] = input[0][i];
//            }
//        }
//
//        System.out.println(answer[0] + " " + answer[1]);
//    }

    // 비트연산자 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = {{sc.nextInt(), sc.nextInt()}, {sc.nextInt(), sc.nextInt()}, {sc.nextInt(), sc.nextInt()}};
        int[] answer = new int[2];

        answer[0] = input[0][0]^input[1][0]^input[2][0];
        answer[1] = input[0][1]^input[1][1]^input[2][1];

        System.out.println(answer[0] + " " + answer[1]);
    }
}
