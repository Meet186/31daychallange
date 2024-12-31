public class binrySerch {
    static boolean binarySerch(int arr[],int target){
        // TC - O(logN)
        // SC - O(1)
        int start = 0;
        int end = arr.length-1;
        // Apply Binary Search
        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target) return true;
            else if (arr[mid] > target) { // Reduce the Searching Space
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,45,78,88,90,100,454};
        System.out.println(binarySerch(arr,45));

    }
}
