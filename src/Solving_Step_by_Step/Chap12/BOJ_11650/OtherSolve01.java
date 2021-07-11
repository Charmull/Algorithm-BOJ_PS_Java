package Solving_Step_by_Step.Chap12.BOJ_11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class OtherSolve01 {
    private static void quickSort(int[][] arr, int left, int right) {
        if(left >= right) {
            return;
        }
        int pi = partition(arr, left, right);
        quickSort(arr, left, pi-1);
        quickSort(arr, pi+1, right);
    }

    private static int partition(int[][] arr, int left, int right) {
        int pivot1 = arr[0][(left+right) / 2];
        int pivot2 = arr[1][(left+right) / 2];
        int i = left;
        int j = right;

        while(i < j) {
            while(pivot1 < arr[0][j] || (pivot1 == arr[0][j] && pivot2 < arr[1][j])) {
                j--;
            }
            while(i < j && (pivot1 > arr[0][i] || (pivot1 == arr[0][i] && pivot2 > arr[1][i]))) {
                i++;
            }
            swap(arr, i, j);
        }
        return i;
    }

    private static void swap(int[][] arr, int i, int j) {
        int temp1 = arr[0][i];
        int temp2 = arr[1][i];
        arr[0][i] = arr[0][j];
        arr[1][i] = arr[1][j];
        arr[0][j] = temp1;
        arr[1][j] = temp2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[2][N];

        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[0][i] = Integer.parseInt(st.nextToken());
            arr[1][i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr, 0, N-1);

        for(int i = 0 ; i < N ; i++) {
            sb.append(arr[0][i] + " " + arr[1][i]).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}
