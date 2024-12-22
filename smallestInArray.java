import java.util.Scanner;
public class smallestInArray {
    static int smallestInArray(int arr[]){
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
          small =  Math.min(small,arr[i]);
        }
        return small;
    }
    static int smallest(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    static int recurssive(int arr[],int idx){
       if(idx == arr.length-1){
           return arr[idx];
       }
       int smallest = recurssive(arr,idx+1);
       if(arr[idx]< smallest){
           return arr[idx];
       } else {
           return smallest;
       }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements want to insert in an Array : ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.printf("Enter %d elements\n",n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int small = smallestInArray(arr);
        System.out.printf("Smallest element is an Array is : %d",small);
    }
}
