//The program:
//        Swap each character at an even position with the next character if there is one. Positions start at zero.
//        INPUT:
//        A single string s.
//
//        OUTPUT:
//        The transformed string.
//
//        CONSTRAINTS:
//        s contains less than 8192 characters.
//
//        EXAMPLE:
//        Input
//        ABCDEF
//        Output
//        BADCFE

import java.util.Scanner;

public class Test45 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        for (int i=0;i<S.length();i+=2){
            if(i+1 <S.length()){
                System.out.print(S.charAt(i+1));
            }
            System.out.print(S.charAt(i));
        }
    }
}

