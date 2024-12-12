import java.util.Scanner;

public class largest {

    static int largset(int num1, int num2, int num3){
        // TC - O(1)
        // SC - O(1)
        return Math.max(num1,Math.max(num2,num3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1,num2,num 3");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int ans = largset(num1,num2,num3);
        System.out.printf("The largest num is : %d ",ans);

    }
}
