package Solving_Step_by_Step.Chap07.BOJ_1157;

import java.io.IOException;

public class OtherSolve02 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        int input = System.in.read();   // 1byte만 input에 할당

        while(input > 64) {     // 공백 입력받으면 종료
            if(input >= 97) {
                arr[input - 97]++;
            }
            else {
                arr[input - 65]++;
            }

            input = System.in.read();   // 다음 1byte를 input에 할당
        }

        int max = -1;
        char ch = '?';
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char)(i+65);
            }
            else if(arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
