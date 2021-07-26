import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test24 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String names = in.nextLine();
            names=names.toLowerCase();
            char[] s=names.toCharArray();
            ArrayList<Character> r=new ArrayList<>();

            if( names.contains("w")&& names.contains("i")){
                System.out.println("Is a wizard");
            }else {
                System.out.println( "Not a wizard");
            }
        }
    }
}

