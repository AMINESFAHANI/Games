import java.util.Scanner;

public class Test29 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String t = in.next();
            int s=0;
            int e=0;
            for (int j=0;j<3;j++){
                s+=Integer.parseInt(String.valueOf(t.charAt(j)));
            }
            for (int k=3;k<6;k++){
                e+=Integer.parseInt(String.valueOf(t.charAt(k)));
            }

            if(s==e){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}

