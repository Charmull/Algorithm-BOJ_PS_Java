package Solving_Step_by_Step.Chap04.BOJ_1110;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int temp = N;

        int count = 0;
        while(true) {
            temp = (temp%10)*10 + ((temp/10) + (temp%10))%10;
            count++;
            if(N == temp) {
                break;
            }
        }
        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }
}
