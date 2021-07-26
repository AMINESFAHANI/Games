import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();

        int R = sc.nextInt();

        int N = sc.nextInt();
        int A [] = new int[N];

        for(int i=0; i<N;i++){
        A[i] = sc.nextInt();

    }
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] >= L && A[i] <= R) {
                c++;
            }
        }
        System.out.println(c);
    }

}
