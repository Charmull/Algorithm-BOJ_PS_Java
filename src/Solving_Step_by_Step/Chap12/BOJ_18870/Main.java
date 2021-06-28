package Solving_Step_by_Step.Chap12.BOJ_18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int[] sortNums = nums.clone();
        Arrays.sort(sortNums);

        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int num : sortNums) {
            if (!map.containsKey(num)) {
                map.put(num, i++);
            }
        }

        for (int num : nums) {
            sb.append(map.get(num)).append(' ');
        }

        System.out.println(sb);
        br.close();
    }
}
