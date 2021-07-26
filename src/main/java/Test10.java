import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        String s="o   o   p  ppp ";
        ArrayList<Character> r=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && ! r.contains(s.charAt(i)) &&  s.charAt(i)!=' '){
                    r.add(s.charAt(i));
                    System.out.print(s.charAt(i));
                }
            }
        }
    }
}
