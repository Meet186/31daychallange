public class secondlargest {
    static int secondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        for(int num : arr) largest = Math.max(largest,num);
        for(int num : arr){
            if(num != largest && num > sLargest) sLargest = num;
        }
        return sLargest;
    }
    static int secondLargest2(int arr[]){
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                sLargest = largest;
                largest = num;
            } else if (num > sLargest && num != largest) {
                sLargest = num;
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,7,8,9,10,45,77,20,12,30,40};
        System.out.println(secondLargest(arr));
    }
}
