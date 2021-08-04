/**
 * sample input:
 * 1 2 4 6 8
 * 3 4 5 6 7 8 9
 *  out put:
 *  4,6,8
 *
 *
 */




import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public abstract class Test49 {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            String S1 = in.nextLine();
            String S2 = in.nextLine();
            ArrayList<Integer> list=new ArrayList<>();
            String[]arr=S1.split(" ");
            for (String x:arr){
                if(S2.contains(x)){
                    list.add(Integer.parseInt(x));

                }
            }

            Collections.sort(list);
            System.out.println(list);
        }
    }

