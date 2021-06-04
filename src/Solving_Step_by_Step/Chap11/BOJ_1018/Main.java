package Solving_Step_by_Step.Chap11.BOJ_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// TODO : 다시 풀어보기
public class Main {
    static boolean[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        board = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            String row = br.readLine();
            for(int j = 0; j < m; j++) {
                if(row.charAt(j) == 'B') {
                    board[i][j] = false;
                }
                else {
                    board[i][j] = true;
                }
            }
        }

        // 체스판이 나올 수 있는 최대 개수 (nCount * mCcount)
        int nCount = n - 7;
        int mCcount = m - 7;

        int count = 64;
        for(int i = 0; i < nCount; i++) {
            for(int j = 0; j < mCcount; j++) {
                int countTemp = countChange(i, j);
                count = Math.min(count, countTemp);
            }
        }

        System.out.println(count);

        br.close();
    }

    private static int countChange(int x, int y) {
        int endX = x + 8;
        int endY = y + 8;
        boolean check = board[x][y];

        int count = 0;
        for(int i = x; i < endX; i++) {
            for(int j = y; j < endY; j++) {
                if(check != board[i][j]) {
                    count++;
                }
                check = !check;
            }
            check = !check;
        }

        return Math.min(count, 64 - count);
    }
}
