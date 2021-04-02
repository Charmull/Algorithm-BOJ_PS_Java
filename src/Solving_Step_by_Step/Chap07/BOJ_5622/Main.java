package Solving_Step_by_Step.Chap07.BOJ_5622;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        char[] arr = input.toCharArray();

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(65 <= arr[i] && arr[i] <= 67) {
                sum += 3;
            }
            else if(68 <= arr[i] && arr[i] <= 70) {
                sum += 4;
            }
            else if(71 <= arr[i] && arr[i] <= 73) {
                sum += 5;
            }
            else if(74 <= arr[i] && arr[i] <= 76) {
                sum += 6;
            }
            else if(77 <= arr[i] && arr[i] <= 79) {
                sum += 7;
            }
            else if(80 <= arr[i] && arr[i] <= 83) {
                sum += 8;
            }
            else if(84 <= arr[i] && arr[i] <= 86) {
                sum += 9;
            }
            else if(87 <= arr[i] && arr[i] <= 90) {
                sum += 10;
            }
        }

        bw.write(Integer.toString(sum));

        br.close();
        bw.flush();
        bw.close();
    }
}
