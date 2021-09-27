package IfElseAndSwitch;

import java.util.Scanner;

public class SeasonOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Month");
        String MonthName = scanner.next();

        switch (MonthName){
            case "december":
                System.out.println("winter");
                break;
            case "january":
                System.out.println("winter");
                break;
            case "february":
                System.out.println("winter");
                break;
            case "march":
                System.out.println("spring");
                break;
            case "april":
                System.out.println("spring");
                break;
            case "may":
                System.out.println("spring");
                break;
            case "jun":
                System.out.println("summer");
                break;
            case "july":
                System.out.println("summer");
                break;
            case "august":
                System.out.println("summer");
                break;
            case "september":
                System.out.println("fall");
                break;
            case "october":
                System.out.println("fall");
                break;
            case "november":
                System.out.println("fall");
                break;

            default:
            {
                System.out.println("invaild month");
            }





        }
    }
}
