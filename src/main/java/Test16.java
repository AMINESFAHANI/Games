import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test16 {
    public static void main(String[] args) {
        int[] a= {2,3,6,7, 1,8,5, 5, 2};
        List<Integer> arr= new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(Math.abs(a[i]-a[j])==1 && !arr.contains(a[i]) && !arr.contains(a[j])){
                  arr.add(a[i]);
                  arr.add(a[j]);
                  h.put(a[i],a[j]);
                }
            }
        }
        System.out.println(h.toString());
    }
}
