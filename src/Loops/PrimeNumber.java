package Loops;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {

                System.out.println("number is Prime Number");
            } else {

            }

        }
    }
}
