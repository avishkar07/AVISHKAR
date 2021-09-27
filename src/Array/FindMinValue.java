package Array;

public class FindMinValue {
    public static void main(String[] args) {
        int [] number={70,42,57,10,50};
        int min=number[0];
        for(int i=0; i<number.length; i++){
            if(number[i]<=min)
            {
                min=number[i];
            }
        }
        System.out.println("min value="+min);

    }
}
