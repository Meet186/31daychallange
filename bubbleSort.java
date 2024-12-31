import java.util.Arrays;

public class bubbleSort {
    static void bubleSort(int arr []){ // TC - O(N*N) // SC - O(1)
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {4,5,8,7,1,2,3,1,0,21,11};
        bubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
