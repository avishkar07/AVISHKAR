package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=i*fact;
        }
        System.out.println("Factorial is" +fact);
    }
}
