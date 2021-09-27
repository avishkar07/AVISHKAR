package IfElseAndSwitch;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Number");
        int input = scanner.nextInt();
        if(input % 2==0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");

        }
    }
}

