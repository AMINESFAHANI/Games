//The program:
//        Your program must print the N first numbers of an arithmetic sequence of common difference R and started by 0.
//
//        An arithmetic sequence is a sequence of numbers such that the next term can be computed by adding a constant value R.
//
//        INPUT:
//        Two space separated integers N and R.
//
//        OUTPUT:
//        The first N integers of the arithmetic sequence of common difference R, starting with 0.
//
//        CONSTRAINTS:
//        0 < N < 100
//        0 ≤ R ≤ 100


import java.util.Scanner;

public class Test31 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int R = in.nextInt();
        int r=0;
        System.out.print(0+" ");
        for(int i=0; i<N-1;i++){
            r+=R;
            if(i==N-2){
                System.out.println(r);
            }else {
                System.out.print(r + " ");
            }
        }
    }
}
