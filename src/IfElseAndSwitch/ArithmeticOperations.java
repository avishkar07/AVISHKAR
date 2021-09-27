package IfElseAndSwitch;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2st Number");
        int num2 = scanner.nextInt();
        System.out.println("choose the operation");
        System.out.println("1=+ 2=- 3=* 4=/  5=%");
        int n =scanner.nextInt();

        switch (n)
        {
            case 1:
                int add;
                add= num1+num2;
                System.out.println("answer =" +add);
                break;
            case 2:
            int  sub;
            sub =num1-num2;
                System.out.println("answer="+sub);
                break;
            case 3:
            int mul=num1*num2;
                System.out.println("answer="+mul);
                break;
            case 4:
             int div=num1/num2;
                System.out.println("answer="+div);
                break;
            case 5:
             int mod=num1%num2;
                System.out.println("answer="+mod);
                break;
        }
    }
}
