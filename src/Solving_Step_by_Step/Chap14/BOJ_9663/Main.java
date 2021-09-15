package Solving_Step_by_Step.Chap14.BOJ_9663;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static int[] arr;
    public static int N;
    public static int count = 0;

    // 해당 열에서 col번째 행에 놓을 수 있는가
    private static boolean Possibility(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {       // 이미 같은 행에 존재할 경우
                return false;
            }
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {        // 이미 대각선에 존재할 경우
                return false;
            }
        }
        return true;
    }

    private static void nQueen(int depth) {
        if (depth == N) {           // 행을 다 채웠을 때 count 1 증가시키고 리턴
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (Possibility(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);

        System.out.println(count);
        br.close();
    }
}
