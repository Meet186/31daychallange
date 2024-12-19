import java.util.Scanner;
public class fibnaci {
    static int fibnaci(int n){
        // TC-O(2^N)
        // SC-O(N)
        if(n <= 1){
            return n;
        }
        return fibnaci(n-1) + fibnaci(n-2);
    }
    static void printFibnaciSeries(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(fibnaci(i) + ",");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms to get fibonacci sequence..");
        int n = sc.nextInt();
        printFibnaciSeries(n);
    }
}
