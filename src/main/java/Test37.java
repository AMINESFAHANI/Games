import java.util.Scanner;

public class Test37 {

// What is the most intersections points between circlec ?


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        long c=0;
        for (int i=0; i<x;i++){
            c+=(i*2);
        }
        System.out.println(c);
    }
}

