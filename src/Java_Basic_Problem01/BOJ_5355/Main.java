package Java_Basic_Problem01.BOJ_5355;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String test = sc.nextLine();

        for(int i = 0; i < T; i++) {
            test = sc.nextLine();

            String[] arr = test.split(" ");
            double result = Double.parseDouble(arr[0]);

            for(int j = 1; j < arr.length; j++) {
                if(arr[j].equals("@")) {
                    result *= 3;
                }
                else if(arr[j].equals("%")) {
                    result += 5;
                }
                else if(arr[j].equals("#")) {
                    result -= 7;
                }
            }
            System.out.println(String.format("%.2f", result));
        }
    }
}