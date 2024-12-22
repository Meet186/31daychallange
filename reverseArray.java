import java.util.Arrays;
public class reverseArray {
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArray(int arr[]){ // TC-O(N) // SC - O(1)
        int i = 0,j = arr.length-1;
        while (i < j){
           swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int [] reverseArray1(int arr[]){ // TC-O(N) // SC - O(1)
        int n = arr.length;
        int ans [] = new int[n];
        int idx = 0;
        for (int i = n-1; i >=0 ;i--) {
            ans[idx++] = arr[i];
        }
        return ans;
    }
    static int [] recurssive(int arr[],int idx){ // TC-O(N) // SC - O(N)
       int n = arr.length;
       if(idx == n){
           return new int[arr.length];
       }
       int reverse [] = recurssive(arr,idx+1);
           reverse[n-1-idx] = arr[idx];
           return reverse;
    }
    public static void main(String[] args) {
        int arr [] = {0,1,2,3,4,5,6,7,8,9};
       int ans [] =  recurssive(arr,0);
        System.out.println(Arrays.toString(ans));

    }
}
