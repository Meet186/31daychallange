import java.util.Scanner;

public class day1oddeven {

    static void oddEven(int n){
        if(n % 2 == 0){
            System.out.printf("%d is -> Even", n);
        } else {
            System.out.printf("%d is -> Odd", n);
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        oddEven(n);

    }
}
