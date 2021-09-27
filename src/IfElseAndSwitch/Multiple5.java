package IfElseAndSwitch;

import java.util.Scanner;

public class Multiple5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        if(num % 5==0){
            System.out.println("Number is Multiple by 5");
        }
        else
        {
            System.out.println("Number is not multiple by 5");
        }
    }
}
