import java.util.Scanner;

public class Test4 {



    public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i=n;i>0;i--){
                System.out.println(" _ ");
                System.out.print(" ".repeat(n-i)+"/ \\".repeat(i)+"\n");
                System.out.println(" ".repeat(n-i)+"\\_/".repeat(i));

            }


        }
    }
