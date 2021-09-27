package Loops;

import java.util.Scanner;

public class TableofNumber {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int m = scanner.nextInt();
        int n;
        for (n = 1; n <= 10;n++ ){
            System.out.println(n*m);
    }
}
}
