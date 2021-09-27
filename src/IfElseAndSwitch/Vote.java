package IfElseAndSwitch;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age ");
        int Age = scanner.nextInt();
        if (Age >= 18){
            System.out.println("Eligible for IfElseAndSwitch.Vote");
        }
        else {
            System.out.println("Not Eligible for IfElseAndSwitch.Vote");
        }
    }
}
