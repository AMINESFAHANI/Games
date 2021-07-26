import java.util.ArrayList;

public class Test20 {
    public static void main(String[] args) {
        int[] a={1,2,5,4,3,14,2,7,88,6,4,4};
        int n =4;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(n);
        for (int i=0;i<a.length;i++){
            if(n<a[i]){
                arr.add(arr.size(),a[i]);
            }else if(n>a[i]) {
                arr.add(0,a[i]);
            }else {
                arr.add(arr.indexOf(n)+1,a[i]);
            }
        }
        arr.remove(n);
        System.out.println(arr.toString());
    }
}
