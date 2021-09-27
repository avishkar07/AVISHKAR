package IfElseAndSwitch;

import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the char");
        String input = scanner.next();

        switch (input)
        {
            case "a":
                System.out.println("it is vowel");
                break;
            case "e":
                System.out.println("it is vowel");
                break;
            case "i":
                System.out.println("it is vowel");
                break;
            case "o":
                System.out.println("it is vowel");
                break;
            case "u":
                System.out.println("it is vowel");
                break;
            default:
                System.out.println("invalid");



        }

    }
}
