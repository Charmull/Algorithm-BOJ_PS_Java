package Solving_Step_by_Step.Chap06.BOJ_1065;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 1; i <= N; i++) {
            int[] splitNum = new int[4];
            int temp = i;
            int betweenNum = 0;
            boolean flag = true;

            for(int j = 0; temp != 0; j++) {
               splitNum[j] = temp%10;
               temp /= 10;
               if(j == 1) {
                   betweenNum = splitNum[j-1] - splitNum[j];
               }
               if(j > 1) {
                   if(betweenNum != splitNum[j-1] - splitNum[j]) {
                       flag = false;
                       break;
                   }
               }
            }

            if(flag) {
                count++;
            }
        }

        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }
}
