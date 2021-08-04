import java.util.Scanner;

public class Test51 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[][] r=new int[n][n];
        r[0][0]=q;
        for (int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<n;j++){
                if(i==0 && j!=0){
                    r[i][j]=r[i][j-1]+1;
            }else if(j==0&& i!=0){
                    r[i][j]=r[i-1][j]+1;
                }else if(i!=0 && j!=0){
                    r[i][j]=r[i][j-1]+1;
                }
                System.out.print(r[i][j]+" ");
            }

        }

    }
}
