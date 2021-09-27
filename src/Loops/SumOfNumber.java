package Loops;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N = scanner.nextInt();
        int i,sum=0;
        for(i=1;i<=N;i++){
         sum= i + sum;

        }
        System.out.println("Sum of Number is" +sum);
     }
}
