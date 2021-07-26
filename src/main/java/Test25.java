import java.util.Scanner;

public class Test25 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String C = in.nextLine();
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int r=0;
        for (int i = 0; i < N; i++) {
            String ligne = in.nextLine();
            for(int j=0;j<ligne.length();j++){
                if( String.valueOf(ligne.charAt(j)).equals( C )){
                    r++;
                }
            }
        }
        System.out.println(r);
    }
}

