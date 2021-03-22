package Solving_Step_by_Step.Chap05.BOJ_1546;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(arr);
        double max = arr[N-1];
        double result = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = arr[i]/max*100;
            result += arr[i];
        }

        bw.write(Double.toString(result/N));

        br.close();
        bw.flush();
        bw.close();
    }
}
