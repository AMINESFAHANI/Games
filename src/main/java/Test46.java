/**
 * Clash of Code
 * sorted unique squared in a list of positive and negative integers.
 *
 *
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test46 {

    public static void main(String args[]) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            if(!arr.contains((int)Math.pow(X,2))){
                arr.add((int)Math.pow(X,2));
            }
        }


        Collections.sort(arr);
        System.out.println(arr.toString());
    }
}

