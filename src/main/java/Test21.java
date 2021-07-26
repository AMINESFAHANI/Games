import java.util.Scanner;

public class Test21 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int c=0;
        for (int i=0; i<s.length();i++){
            c+=(int)s.charAt(i)*i;
        }
        System.out.println(c);
    }
}

