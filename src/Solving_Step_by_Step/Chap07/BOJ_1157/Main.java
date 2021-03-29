package Solving_Step_by_Step.Chap07.BOJ_1157;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, 0);

        for(int i = 0; i < input.length(); i++) {
            int idx;
            if(input.charAt(i) >= 97) {
                idx = input.charAt(i) - 97;
                arr[idx]++;
            }
            else {
                idx = input.charAt(i) - 65;
                arr[idx]++;
            }
        }

        int maxCount = -1;
        int maxIdx = -1;
        boolean isMaxMany = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxCount) {
                maxCount = arr[i];
                maxIdx = i;
                isMaxMany = false;
            }
            else if(arr[i] == maxCount) {
                maxIdx = i;
                isMaxMany = true;
            }
        }

        if(isMaxMany) {
            bw.write("?");
        }
        else {
            bw.write(maxIdx+65);
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
