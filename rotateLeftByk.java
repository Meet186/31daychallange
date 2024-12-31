import java.util.Arrays;

public class rotateLeftByk {
    static void  reverse(int arr [],int start,int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotateLeftByK(int arr [],int k){
        int n = arr.length;
        k = k % n; // to avoid unnecessary rotations
        reverse(arr,0,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
    }
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50,60,70};
        rotateLeftByK(arr,4);
        System.out.println(Arrays.toString(arr));

    }
}
