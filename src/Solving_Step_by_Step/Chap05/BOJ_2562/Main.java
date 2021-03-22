package Solving_Step_by_Step.Chap05.BOJ_2562;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.parseInt(br.readLine());
        int maxIdx = 0;

        for(int i = 1; i < 9; i++) {
            int temp = Integer.parseInt(br.readLine());
            if(max < temp) {
                max = temp;
                maxIdx = i;
            }
        }
        bw.write(max + "\n" + (maxIdx+1));

        br.close();
        bw.flush();
        bw.close();
    }
}
