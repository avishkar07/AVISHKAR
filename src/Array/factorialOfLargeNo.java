package Array;

public class factorialOfLargeNo {
    public static void main(String[] args) {
        int []Array = {1,2,4,6,8,3};

        int max=Array[0];
        for (int i = 0; i <Array.length-1; i++) {

          if (  max <= Array[i]){
              max = Array[i];
          }

        }

        System.out.println("lagest no in Array is :"+ max);
        int fact =1;
        for (int i = 1; i <= max ; i++) {
        fact=i*fact;
        }
        System.out.println("Factorial of largest Number in array is :" +fact);

    }

}
