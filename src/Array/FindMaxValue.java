package Array;

public class FindMaxValue {
    public static void main(String [] args) {
        int [] number = { 12,23,15,53,83};
        int max =number[0];
        for (int i = 0; i < number.length ; i++) {

            if (number[i]>=max) {
                max = number[i];
            }
        }
        System.out.println("max value is"+ max);
    }
}



