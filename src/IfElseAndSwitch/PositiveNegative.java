package IfElseAndSwitch;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num= scanner.nextInt();
        if (num > 0){
            System.out.println("The Number is Positive");
        }
        else {
            System.out.println("The Number is Negative");
        }
    }
}
