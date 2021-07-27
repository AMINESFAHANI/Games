import java.util.Scanner;

public class Test34 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] primes=new int[n];
        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            primes[i]=p;
        }
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            String t="T";
            for (int j=0;j<n;j++){
                if(x%primes[j]!=0){
                    t="F";
                    break;
                }
            }
            System.out.print(t);
        }
    }
}


