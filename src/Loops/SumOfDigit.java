package Loops;

public class SumOfDigit {
    public static void main(String[] args) {
        int num=123;
        int sum=0;
        while(num > 0){
            int lastDigit = num % 10;
            sum = lastDigit + sum;
            num = num / 10;
        }
        System.out.println(sum);
    }
}