package Array;

public class SumOfArrayelements {
    public static void main(String[] args) {

        int[] Array ={12,23,24,54,11};
        int sum =0;
        for(int element : Array){
            sum=sum+element;
        }
        System.out.println("Sum  of Array=" +sum);
    }
}


