import java.util.*;

public class Test22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String[] s=n.split(",");
        for (int i=0;i<s.length-1;i++){
            for(int j=Integer.parseInt(s[i]);j<Integer.parseInt(s[i+1]);j++){
                System.out.print(j+" ,");
            }

        }
        System.out.println(Integer.parseInt(s[s.length-1]));
        ArrayList<Object> l=new ArrayList<>();
        l.add("amin");
        l.add(35);
        l.add(true);
        System.out.println(l.toString());
        LinkedHashMap<Integer,Integer> h=new LinkedHashMap<>();
        h.put(1,3);
        h.put(3,4);
        h.put(4,1);
        System.out.println(h.toString());

        HashMap<Integer,Integer> hp=new HashMap<>();
        hp.put(1,3);
        hp.put(3,4);
        hp.put(4,1);
        System.out.println(h.toString());
        System.out.println(hp.values());
        for(int i :hp.keySet()){
            System.out.print(i+" : "+hp.get(i));
        }
            }

    }

