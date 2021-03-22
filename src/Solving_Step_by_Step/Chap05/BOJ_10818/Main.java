package Solving_Step_by_Step.Chap05.BOJ_10818;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = min;
        for(int i = 1; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(min > temp) {
                min = temp;
            }
            if(max < temp) {
                max = temp;
            }
        }

        bw.write(min + " " + max);

        br.close();
        bw.flush();
        bw.close();
    }
}
