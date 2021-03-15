package BOJ_2480;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] line = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        Arrays.sort(line);

        if(line[0] == line[1] && line[0] == line[2]) {
            System.out.println(10000 + line[0] * 1000);
        }
        else if(line[0] != line[1] && line[0] != line[2] && line[1] != line[2]) {
            System.out.println(100 * line[2]);
        }
        else {
            int twice = line[0];
            for(int i = 0; i < 3; i++) {
                for(int j = i + 1; j < 3; j++) {
                    if(line[i] == line[j]) {
                        twice = line[i];
                    }
                }
            }
            System.out.println(1000 + 100 * twice);
        }
    }
}