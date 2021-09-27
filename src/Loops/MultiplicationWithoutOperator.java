package Loops;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class MultiplicationWithoutOperator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the two Numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum=0;
        for (int i=1;i<=num1;i++){
            sum=sum+num2;
        }
        System.out.println("the Multiplication of Two number  :"+sum);
    }
}
