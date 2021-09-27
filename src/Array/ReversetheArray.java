package Array;

public class ReversetheArray {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5};
        System.out.println("Original arrya:");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ,");
        }
        System.out.println();
        System.out.println("reversed Arrya :");
        for( int j= array.length-1;j>=0;j--){
            System.out.print(array[j]+" ,");
        }
    }
}
