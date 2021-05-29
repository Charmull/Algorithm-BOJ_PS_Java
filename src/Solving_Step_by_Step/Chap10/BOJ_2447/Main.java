package Solving_Step_by_Step.Chap10.BOJ_2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO : 다시 스스로 풀어보기, 다른 방법 도전해보기
public class Main {
    static char[][] arr;

    private static void star(int x, int y, int n, boolean blank) {
        if(blank) {
            for(int i = x; i < x+n; i++) {
                for(int j = y; j < y+n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(n == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = n/3;
        int count = 0;
        for(int i = x; i < x+n; i += size) {
            for(int j = y; j < y+n; j += size) {
                count++;
                if(count == 5) {
                    star(i, j, size, true);
                }
                else {
                    star(i, j, size, false);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        star(0, 0, n, false);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);

        br.close();
    }
}
