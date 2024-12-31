import java.util.*;
public class removeDuplicate {
    static int [] removeDuplicate1(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int num : arr)  set.add(num);
        int [] result = new int[set.size()];
        int idx = 0;
        for(int num : set)  result[idx++] = num;
        return result;
    }
    static int [] removeDuplicate2(int arr []){
        Arrays.sort(arr);
        int temp [] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1])  temp[j++] = arr[i];
        }
        temp[j++] = arr[arr.length-1];
        int ans [] = Arrays.copyOf(temp,j);
        return ans;
    }
    static int [] recurssive(int arr[]){
        Set<Integer> set = new HashSet<>();
        return helper(arr,0,set);
    }
    static int [] helper(int arr[],int idx,Set<Integer> set){
        if(idx == arr.length){
            int [] result = new int[set.size()];
            int index = 0;
            for(int num : set) result[index++] = num;
            return result;
        }
        if(!set.contains(arr[idx]))  set.add(arr[idx]);
        return helper(arr,idx+1,set);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter " + n + " elements");
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("After remove duplicate the array is :");
        System.out.println(Arrays.toString(removeDuplicate1(arr)));
    }
}
