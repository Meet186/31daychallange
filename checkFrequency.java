import java.util.*;
public class checkFrequency {
    static int frequencyOfEl(int arr[],int el){
        int count = 0;
        for(int num : arr) if(num == el) count++;
        return count;
    }
    static int frequencyOfEl2(int arr[],int el){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(!map.containsKey(num)) map.put(num,1);
            else map.put(num,map.get(num)+1);
        }
        if(map.containsKey(el)) return map.get(el);
        else return -1;
    }
    static int recurssive(int arr[],int el,int idx){
        if(idx == arr.length) return 0;
        if(arr[idx] == el) return 1 + recurssive(arr,el,idx+1);
        else return recurssive(arr,el,idx+1);
    }
    public static void main(String[] args) {
        int arr [] = {1,1,1,1,2,2,4,5,8,71,1,1,7,9,10,1,2,3,10};
        System.out.println(recurssive(arr,1,0));
    }
}
