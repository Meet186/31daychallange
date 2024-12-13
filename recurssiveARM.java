public class recurssiveARM {

    static int countDigit(int n){
        if(n == 0) return 0;
        return 1 + countDigit(n/10);
    }
    static boolean armstrong(int n ){
        int pow = countDigit(n);
        return helper(n,pow,0,n);
    }
    static boolean helper(int n , int power,int sum,int originalnum){
        if(n == 0){
            return sum == originalnum;
        }
        int lastDigit = n%10;
        sum += Math.pow(lastDigit,power);
        return helper(n/10,power,sum,originalnum);
    }
    public static void main(String[] args) {
        System.out.println(armstrong(1553));
    }
}
