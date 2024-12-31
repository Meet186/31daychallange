import java.util.*;
public class intersection {
    static int [] intersection(int arr1 [],int arr2 []){ // TC - O(m + n)  // SC - O(m+n)
        Set<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        List<Integer> intersection = new ArrayList<>();
        for(int num : arr2){
            if(set.contains(num)){
                intersection.add(num);
                set.remove(num); // avoid duplicate
            }
        }
        int result [] = new int[intersection.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }
    static List<Integer> intersection2(int arr1[],int arr2[]){ // TC - O(NlogN + m+n) // SC - (min(m,n)
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i =0, j = 0;
        List<Integer> result = new ArrayList<>();
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                result.add(arr1[i]);
                i++;
                j++;
            }else if (arr1[i] < arr2[j]) {
                i++;
            }else {
                j++;
            }
        }
        return result;
    }

    static List<Integer> intersection3(int arr1[],int arr2[]){
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    ans.add(arr1[i]);
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1 [] = {1,4,5,7,8,11,10};
        int arr2 [] = {1,5,7,0,3,12,6,2,4,1};
        List<Integer> ans = intersection3(arr1,arr2);
        System.out.println(ans);

    }
}
