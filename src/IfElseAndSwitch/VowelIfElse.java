package IfElseAndSwitch;

import java.util.Scanner;

public class VowelIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Char");
         String input = scanner.next();

        if ((input == "a") || (input=="e") || (input =="i") || (input=="o") || (input=="u")){
            System.out.println(input+"is vowel");
        }
        else {
            System.out.println("invalid ");

        }
    }
}
