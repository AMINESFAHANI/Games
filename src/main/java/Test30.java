import java.util.Locale;
import java.util.Scanner;

public class Test30 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String s=string.toLowerCase();
        for (int i=0; i<s.length();i++){
            if(s.charAt(i)=='i' || s.charAt(i)=='o'||s.charAt(i)=='a' || s.charAt(i)=='e'){
                System.out.print(s.charAt(i)+"p"+s.charAt(i));
            }else {
                System.out.println(s.charAt(i));
            }
        }

    }
}

