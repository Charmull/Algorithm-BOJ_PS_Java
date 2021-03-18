package Java_Basic_Problem01.BOJ_8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            String input = sc.next();
            int numOfO = 0;
            int result = 0;

            for(int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == 'O') {
                    numOfO++;
                    result += numOfO;
                }
                else {
                    numOfO = 0;
                }
            }

            System.out.println(result);
        }
    }
}
