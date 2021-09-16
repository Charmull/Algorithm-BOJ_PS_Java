package Solving_Step_by_Step.Chap14.BOJ_2580;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr = new int[9][9];

    private static boolean possibility(int row, int col, int value) {
        for (int i = 0; i < 9; i++) {           // 같은 행에 있는 열 값 중 겹치는 값이 있는지 확인
            if (arr[row][i] == value) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {           // 같은 열에 있는 행 값 중 겹치는 값이 있는지 확인
            if (arr[i][col] == value) {
                return false;
            }
        }

            int set_row = (row / 3) * 3;        // value가 속한 3*3의 행 첫 위치
            int set_col = (col / 3) * 3;        // value가 속한 3*3의 열 첫 위치

        for (int i = set_row; i < set_row + 3; i++) {           // value가 속한 3*3 칸 안에 중복되는 값이 있는지 확인
            for (int j = set_col; j < set_col + 3; j++) {
                if (arr[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void sudoku(int row, int col) {
        if (col == 9) {         // 행이 다 채워졌을 경우 다음 행의 첫 번째 열부터 확인
            sudoku(row + 1, 0);
            return;
        }

        if (row == 9) {         // 행과 열이 다 채워졌을 경우 출력한 뒤 종료
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }

            System.out.println(sb);
            System.exit(0);
        }

        if (arr[row][col] == 0) {       // 현재 위치가 0일 경우 1~9 중 가능한 수 찾기
            for (int i = 1; i <= 9; i++) {
                if (possibility(row, col, i)) {
                    arr[row][col] = i;
                    sudoku(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }

        sudoku(row, col + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0, 0);
        br.close();
    }
}