package Array;


import sun.security.x509.InvalidityDateExtension;

import java.util.Scanner;

public class TakeValueFormUser {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the values :");
        int size = scanner.nextInt();
        int [] array= new int [size];
        System.out.println("Enter the value of Array");
        for (int i = 0; i < array.length; i++) {
            array [i]=scanner.nextInt();
            System.out.print(array[i] + " ,");
        }

    }

    }

