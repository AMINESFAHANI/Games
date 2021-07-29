import java.util.Scanner;

public class Test41 {


    public static int stringSimilarity(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            String r = s.substring(i, s.length());
            System.out.println(r);
            for (int j = 0; j < r.length(); j++) {
                if (r.charAt(j) == s.charAt(j)) {
                    c++;
                } else {
                    break;
                }
            }
        }
        return c;
    }
    public static void main(String args[]) {
        System.out.println(Test41.stringSimilarity("ababaa"));

    }
}