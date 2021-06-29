package Solving_Step_by_Step.Chap12.BOJ_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class OtherSolve01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[i] = temp;
            if(hm.containsKey(temp)) {
                hm.put(temp, hm.get(temp) + 1);
            }
            else {
                hm.put(temp, 1);
            }
            sum += temp;
        }

        double avg = (double) sum / n;
        sb.append(Math.round(avg)).append('\n');

        Arrays.sort(arr);
        sb.append(arr[n / 2]).append('\n');
        int max = 0;

        for(int z : hm.values()) {
            max = Math.max(max, z);
        }

        int count = 0;
        int mz = 0;
        for(int z : arr) {
            if(hm.get(z) == max) {
                mz = z;
                count++;
            }
            if(count == max + 1) {
                mz = z;
                break;
            }
        }

        sb.append(mz).append('\n');
        sb.append(arr[n-1] - arr[0]);

        System.out.println(sb);
        br.close();
    }
}
