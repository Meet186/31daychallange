import java.util.Arrays;
public class targetindex {
    static int findTarget(int arr[],int target){  // TC - O(NlogN)  // SC - O(1)
        Arrays.sort(arr); // TC-(N)
        int start = 0;
        int end = arr.length-1;
        while (start <= end){ // TC - O(logN)
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    static int findTarget1(int arr[],int target){
        // TC - O(N)  SC - O(1)
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {1,4,7,8,9,11,10,78,100,112};
        int target = 11;
        System.out.println(findTarget1(arr,target));
    }
}
