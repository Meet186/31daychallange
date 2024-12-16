import java.util.Scanner;
public class stringrev {
    static String reverseString1(String str){
//        Time Complexity: O(n)
//        Space Complexity: O(n)
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    static String reverseString2(String str){
//        Time Complexity: O(n)
//        Space Complexity: O(n)
        String ans = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }

    static String reverseString3(String str, int idx){
       if(idx == str.length()){
           return "";
        }
      return reverseString3(str , idx + 1) + str.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String ans = reverseString3(str,0);
        System.out.println(ans);
    }
}
