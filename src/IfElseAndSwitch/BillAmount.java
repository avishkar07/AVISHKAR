package IfElseAndSwitch;

import java.util.Scanner;

public class BillAmount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Quantity");
        int Quantity = scanner.nextInt();
        System.out.println("Enter the rate");
        int Rate = scanner.nextInt();
        int Amount = Quantity * Rate;
        System.out.println("Bill Amount =" + Amount);
        int discout = 0;
        if (Amount < 5000) {
            System.out.println("10% discout");
            discout = Amount * 10 / 100;
            System.out.println("Discout=" + discout);
        }
         else if ((5000>=Amount )&&(Amount<10000) ){
                System.out.println("15% discout");
                discout = Amount * 15 / 100;
                System.out.println("Discout=" + discout);
            }
         else if ((10000<=Amount)&&(20000>Amount)){
                System.out.println("20% discout");
                discout = Amount * 20 / 100;
                System.out.println("Discout=" + discout);
            }
         else if((Amount>=20000)){
                System.out.println("50% discout");
                discout = Amount * 50 / 100;
                System.out.println("Discout=" + discout);
            }
            int FinalBill = Amount - discout;
            System.out.println("Final Bill =" + FinalBill);
        }
    }

























