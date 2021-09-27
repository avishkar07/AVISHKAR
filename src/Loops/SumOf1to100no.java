package Loops;

public class SumOf1to100no {
    public static void main(String[] args) {

        int sum=0;
        for (int i=1; i<=100; i++){
            sum=i+sum;
        }
        System.out.println("Sum of 1 to 100 number is" +sum);
    }
}
