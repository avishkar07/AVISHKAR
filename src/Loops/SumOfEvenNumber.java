package Loops;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        int i, sum = 0;
        for (i=2; i <= n;) {
            sum = i + sum;
            i=i+2;
        }
        System.out.println("the sum of even number is" +sum);
    }
}
