package Loops;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371, result=0;
        int originalNum = num;
        while (originalNum != 0) {
            int remainder = originalNum % 10;
            result = (1*1*1)+result;
            originalNum = originalNum / 1;
        }
        if (result == num) {
            System.out.println("number is armstrong number");
        } else {
            System.out.println("Number is Not armstrong number");
        }
    }
}