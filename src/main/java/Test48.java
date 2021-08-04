import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test48 {

    public static void main(String args[]) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String N = in.next();
        int c=0;
        for (int i =0; i< N.length();i++){
            System.out.println(N.charAt(i));
            if(Integer.parseInt(String.valueOf(N.charAt(i)))==0){
                c++;
                if(i==N.length()-1){
                    arr.add(c);
                }

            }else {
                arr.add(c);
                c=0;
            }
        }
        System.out.println(arr.toString());
        System.out.println(Collections.max(arr));
    }
}

