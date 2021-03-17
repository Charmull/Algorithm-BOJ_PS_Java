package Java_Basic_Problem01.BOJ_7567;

import java.util.Scanner;

public class BestAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int height = 10;
        for(int i = 1; i < input.length(); i++) {
            if(input.substring(i, i+1).equals(input.substring(i-1, i))) {
                height += 5;
            }
            else {
                height += 10;
            }
        }

        System.out.println(height);
    }
}
