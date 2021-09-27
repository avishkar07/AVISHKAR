package Loops;

public class CheckPalindrome {
    public static void main(String[] args) {
        int sum =0,n=121;
        int num =n;
        while(n>0){
           int temp= n% 10;
           sum = (sum *10)+temp;
           n =n/10;
        }
        if (num == sum)
        {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("not Palindrome Number");
        }
    }
}
