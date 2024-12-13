import java.util.Scanner;
public class armstrong {
    static boolean isArmstrong(int number){
        int originalNum = number;
        int sum = 0;
        // Give the length of digits in a number
        int totalDigits = String.valueOf(number).length();
        while (number != 0){
            int digit = number % 10;
            sum += Math.pow(digit,totalDigits);
            number /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check it is Armstrong or not :");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
}
