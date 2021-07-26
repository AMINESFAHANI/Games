import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String RECENT = in.nextLine();
        String OLDEST = in.nextLine();
        String[] a = RECENT.split("-");
        String[] b = OLDEST.split("-");
        int d = 0;
        d += (Integer.parseInt(a[0]) - Integer.parseInt(b[0])) * 30;
        d += Integer.parseInt(a[1]) - Integer.parseInt(b[1]);
        d += (Integer.parseInt(a[2]) - Integer.parseInt(b[2])) * 365;
        if (d < 0) {
            System.out.println("Invalid Date");
        } else if (d == 0) {
            System.out.println("erro");
        } else {
            System.out.println(d);
        }
    }
}




