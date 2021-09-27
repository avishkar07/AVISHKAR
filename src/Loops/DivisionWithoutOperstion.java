package Loops;

import java.util.Scanner;

public class DivisionWithoutOperstion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sub=0;
        while (num1>=num2) {
            sub= num1 - num2;
        }
        System.out.println("the Division  of Two number  :" + sub);

    }


}