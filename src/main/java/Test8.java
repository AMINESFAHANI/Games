import java.util.*;

public class Test8 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String sum = in.next();
        List<Integer> s=new ArrayList<>();
        for (int i=0;i<sum.length();i++){
            if(sum.charAt(i)!='+'){
                s.add(Integer.parseInt(Character.toString(sum.charAt(i))));
            }
        }
        System.out.println(s.toString());
        Collections.sort(s);
        for (int i = 0; i < s.size(); i++) {
            if (i == s.size() - 1) {
                System.out.print(s.get(i));
            } else {
                System.out.print(s.get(i) + "+");
            }
        }
    }
}
