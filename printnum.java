import java.util.Scanner;
public class printnum {
    static void printnum(int n){ // TC-O(logN) // SC - O(logN)
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            System.out.println(num.charAt(i));
        }
    }
    static void recurssive(int n){ // TC-O(logN) // SC - O(logN)
        if(n == 0){
            return;
        }
        recurssive(n/10);
        System.out.println(n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurssive(n);
    }
}
