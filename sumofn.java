import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            // TC - O(n)
            // SC - O(1)
            sum += i;

        }
        System.out.printf("The sum of first n natural num is : %d",sum);


    }
}
