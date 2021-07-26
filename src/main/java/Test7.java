import java.util.Scanner;

public class Test7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int valueCount = in.nextInt();
        for (int i = 0; i < valueCount; i++) {
            String value = in.next();
            if(i<valueCount){
                System.out.print((char) Integer.parseInt(value,16));
            }else {
                break;
            }
        }
    }
}

