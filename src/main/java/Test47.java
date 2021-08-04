import java.util.Arrays;

public class Test47 {

    public static int sum(int...x){
        int s=0;
        System.out.println(Arrays.toString(x));
        for (int i:x){
            s+=i;
        }
    return s;
    }


    public static void main (String[] args){

        System.out.println(sum(1,2,3,4,5,6));

    }
}
