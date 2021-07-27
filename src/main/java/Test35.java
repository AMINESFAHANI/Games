import java.util.Scanner;

public class Test35 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x=0;
        int y=0;
        for (int i = 0; i < n; i++) {
            String step = in.next();

            switch (step){
                case "F":
                    y++;
                    break;
                case "B":
                    y--;
                    break;
                case "R":
                    x++;
                    break;
                default:
                    x--;
            }
        }
        System.out.println( (int) Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
    }
}

