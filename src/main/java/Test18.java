import java.util.Arrays;

public class Test18 {
    public static void main(String[] args) {
        String s="India,Japan,Europe,Iran,America,Irb,Afghanistan,Amerib";
        String[] r=s.split(",");
        for (int i=0;i<r.length;i++){
            for (int j=i+1;j< r.length;j++){
                int l=Math.min(r[i].length(),r[j].length());
                for(int k=0;k<l;k++){
                    if(r[i].charAt(k)> r[j].charAt(k)){
                        String a=r[i];
                        r[i]=r[j];
                        r[j]=a;
                        break;
                    }
                    else if (r[i].charAt(k)< r[j].charAt(k)){
                        break;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(r));
    }
}
