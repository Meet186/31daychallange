import java.util.Scanner;

public class factorial {

    static long factorial(int n){
        // TC - O(n)
        // SC - O(n)

        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find its factorial");
        int n = sc.nextInt();
        System.out.println(factorial(n));

    }
}
