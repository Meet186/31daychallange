import java.util.*;
public class mergeSorted {

    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        // TC - O(m+n) // SC - O(1)
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
        // If there are any elements left in arr2
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args) {
       int arr1 [] = {1,2,3,4};
       int arr2 [] = {5,7,8,9};
       int m = arr1.length;
       int n = arr2.length;
       arr1 = Arrays.copyOf(arr1,m+n);
       merge(arr1,arr2,m,n);
        System.out.println(Arrays.toString(arr1));
    }
}
