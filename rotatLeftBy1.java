import java.util.Arrays;

public class rotatLeftBy1 {
    static void rotateArrayleftBy1(int arr []){
        int n = arr.length;
        int firstEl = arr[0];
        for (int i = 0; i < n-1 ; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = firstEl;
    }
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};
        rotateArrayleftBy1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
