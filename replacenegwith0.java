import java.util.Arrays;
public class replacenegwith0 {
    static void recurssive(int arr[],int index){ // TC - O(N) // SC - O(N)
        if(index == arr.length) return;
        if(arr[index] < 0) arr[index] = 0;
        recurssive(arr,index+1);
    }
    static void replaceNegativeWith0(int arr[]){ // TC - O(N) // SC - O(1)
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int arr [] = {-1,5,4,-7,-5,-77,10,32,45,-23,78};
            replaceNegativeWith0(arr);
        System.out.println(Arrays.toString(arr));
    }
}