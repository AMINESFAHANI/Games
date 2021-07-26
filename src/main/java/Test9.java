import java.util.Arrays;
import java.util.Scanner;

class Test9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String K = in.next();
        int n=K.length();
        String s1 = K.substring(0,n / 2);
        String s2 =K.substring(n/ 2,n);

        if (n % 2 != 0) {
            s2 = K.substring(n/ 2 + 1,n);
        }
        for (int i = (n/2)- 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
        if (n% 2 != 0) {
            System.out.print(K.charAt(n/ 2));
        }
        for (int i = (n/2)- 1; i >= 0; i--) {
            System.out.print(s2.charAt(i));
        }
    }
}







