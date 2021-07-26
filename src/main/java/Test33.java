import java.util.Scanner;
// It was a coding game in clach of code game solved in 07.24.2021 at 10:30 am.
public class Test33 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long r=N;
        int i=0;
        while (r!=1){
            i++;
            if (r%2==0){r/=2;}
            else {r=3*r+1;}
    }
        System.out.println(i);
    }
}
