public class isSorted {
    static boolean isSorted(int arr []){ // TC - O(N) // SC  - O(1)
        if(arr.length <= 1) return true;
        int n =  arr.length;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    static boolean recurssive(int arr [],int index){
        if(index == arr.length-1) return true;
        if(arr[index] > arr[index+1]) return false;
        return recurssive(arr,index+1);
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        System.out.println(recurssive(arr,0));
    }
}
