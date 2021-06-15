package Solving_Step_by_Step.Chap10.BOJ_2447;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class OtherSolve01 {
    static char[][] arr;

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(arr[i], ' ');
        }

        star(N, 0, 0);

        for (int i = 0; i < N; i++) {
            bw.write(arr[i]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static void star(int k, int row, int col){
        if(k == 1) {
            arr[row][col] = '*';
            return;
        }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if(i * j == 1) {
                    continue;
                }
                star(k / 3, row * 3 + i, col * 3 + j);
            }
        }
    }
}
