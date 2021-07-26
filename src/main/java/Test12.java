import java.util.Scanner;

public class Test12 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        char[] s = n.toCharArray();
        boolean b = true;
        for (int i = 0; i < s.length-1; i++) {
            if (Integer.parseInt(String.valueOf(s[i])) > Integer.parseInt(String.valueOf(s[i+1]))) {
                b = false;
                break;
            }
        }
        if(b){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}



