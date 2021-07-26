import java.util.Scanner;

public class Test23 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        String s=Long.toString(N);
        int c=0;
        for (int i=0;i<s.length();i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2==0){
                c+=Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(c);
    }
}

