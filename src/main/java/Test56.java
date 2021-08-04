import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test56 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        class a{};
        Map<a,Integer> map=new HashMap<>();
        String r="";
        for (int i=0;i<n;i++){
            if (i%2==0){
                r+="A";
            }else {
                r+="AB";
            }
            System.out.println( r);
        }


    }
}

