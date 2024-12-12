import java.util.Scanner;

public class primenum {
    static boolean isPrime(int n){
        // TC - O(√n)
        // SC - O(1)
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        // Check divisibility from 3 to √n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;  // Found a divisor, not prime
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check it is prime or not");
        int n = sc.nextInt();
        System.out.println(isPrime(n));

    }
}
