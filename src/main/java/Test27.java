



import java.util.Scanner;

public class Test27 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String T = in.nextLine();
        String r= T.substring(2,T.length());

        int c=0;
        for (int i=r.length()-1;i>=0;i--){
            c+=Integer.parseInt(String.valueOf(r.charAt(i)))*Math.pow(2,r.length()-1-i);

        }
        System.out.println(Integer.toHexString(c));
    }
}

