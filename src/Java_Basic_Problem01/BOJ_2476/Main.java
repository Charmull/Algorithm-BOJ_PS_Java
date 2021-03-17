package Java_Basic_Problem01.BOJ_2476;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] results = new int[T];

        for (int i = 0; i < T; i++) {
            int[] tempResults = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(tempResults);

            if (tempResults[0] == tempResults[1] && tempResults[0] == tempResults[2] && tempResults[1] == tempResults[2]) {
                results[i] = 10000 + tempResults[0] * 1000;
            } else if (tempResults[0] != tempResults[1] && tempResults[0] != tempResults[2] && tempResults[1] != tempResults[2]) {
                results[i] = 100 * tempResults[2];
            } else {
                if (tempResults[0] == tempResults[1] || tempResults[0] == tempResults[2]) {
                    results[i] = 1000 + tempResults[0] * 100;
                } else {
                    results[i] = 1000 + tempResults[1] * 100;
                }
            }
        }
        Arrays.sort(results);
        System.out.println(results[T - 1]);
    }
}