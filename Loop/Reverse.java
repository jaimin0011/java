import java.util.*;

public class Reverse {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int rev =0;
        while(n>0){
            int LastDigit = n%10;
            rev = (rev*10) + LastDigit;
            n/=10;
        }
        System.out.println(rev);
    }
}
  // ip 12345
  // op 54321