import java.util.ArrayList;

public   class Test19 {
    public static void main(String[] args) {
        String s="as,,d,fgh,jk,76y,uiii";
        char[] c=s.toCharArray();
        ArrayList<StringBuilder> r=new ArrayList<>();
        StringBuilder s1=new StringBuilder("");
        int j=0;
        for(int i=0;i<c.length;i++){
            if(c[i]!=',') {
            s1.append(c[i]);
            }else {
                System.out.println(s1);
                if (s1!=new StringBuilder(" ")) {
                    r.add(s1);
                }
                s1=new StringBuilder("");
            }
        }
        if (s1!=null){ r.add(s1);}
        System.out.println(r.toString());
    }

}

