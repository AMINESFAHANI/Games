import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int length = Integer.parseInt(in.nextLine());
        String[] s1=new String[length];
        String[] s2=new String[length];
        for (int i = 0; i < length; i++) {
            String part1 = in.nextLine();
            s1[i]=part1;
        }
        for (int i = 0; i < length; i++) {
            String part2 = in.nextLine();
            s2[i]=part2;
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
            if(s1[i].equals(s2[j])){
                System.out.print(j);
            }

            }
        }
    }
}




