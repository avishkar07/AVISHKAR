package Array;

public class FindUnion {
    public static void main(String args[])
    {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
            int i = 0, j = 0;
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j])
                    System.out.print(arr1[i++] + " ");
                else if (arr2[j] < arr1[i])
                    System.out.print(arr2[j++] + " ");
                else {
                    System.out.print(arr2[j++] + " ");
                    i++;
                }
            }
        System.out.println(arr1[i++] + " ");
        }
}


