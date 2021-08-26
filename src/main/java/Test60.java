import java.util.*;

public class Test60 {

    public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            String[] w=new String[N];
            List<String> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                String word = in.next();
                w[i]=word;
            }
            int c=0;
            w.
            for (int i=0;i<N;i++){
                for (int j=i+1;j<N;j++){
                    if(!arr.contains(w[i]) && w[i].equals(w[j])){
                        arr.add(w[i]);

                    }
                }
            }
        List<List<Integer>>  arra = new ArrayList<>();
            System.out.println(arr.size());
        }
    }

