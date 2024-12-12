import java.util.Scanner;

public class swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("\nValue of a - %d & b - %d Before swap",a,b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.printf("\nValue of a - %d & b - %d After swap",a,b);
        sc.close();

    }
}
