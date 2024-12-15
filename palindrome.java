import java.util.Scanner;
public class palindrome {
    static boolean isPlindrome(int n){
        // TC - O(logN)
        // SC - O(logN)
      int rev = helper(n,0);
      return rev == n;
    }
    static int helper(int n,int reversed){
        // TC - O(logN)
        // SC - O(logN)
        if(n == 0){
            return reversed;
        }
        reversed = reversed * 10 + n%10;
        return helper(n/10,reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check is plindrome");
        int n = sc.nextInt();
        System.out.println(isPlindrome(n));
    }
}

