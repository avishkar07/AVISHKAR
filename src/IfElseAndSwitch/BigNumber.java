package IfElseAndSwitch;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        int num1 =scanner.nextInt();
        System.out.println("Enter the 2nd Number");
        int num2 =scanner.nextInt();
        System.out.println("Enter the 3rd Number");
        int num3 =scanner.nextInt();

         if(num1>num2 && num1 >num3){
             System.out.println("1st number is big");
         }
         else if (num2>num3){
             System.out.println("2nd number is big");
         }else {
             System.out.println("3rd  number is big");
         }

    }
}
