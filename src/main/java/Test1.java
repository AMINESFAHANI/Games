import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A [] = new int[N];
        for(int i=0; i<N;i++){
        A[i] = sc.nextInt();
        }
        int[] B=A.clone();
        Arrays.sort(A);
        int c = 0;
        for (int i = 0; i < B.length; i++) {
            if (A[i] == B[i]) {
                c++;
            }
        }
        System.out.println(Arrays.toString(A));
        System.out.println(c);
    }
    }
