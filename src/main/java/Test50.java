import java.util.*;

public abstract class Test50 extends Test55 {


    public abstract List getCollection();

     public static int  add(int a,int b) {
        try {



        }
        finally {
            System.out.println("finally");
            return a + b;
        }

    }

    public static void main(String[] args){
       int[] a={1,2,3};
        System.out.println(a[1]);
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        System.out.println(arr.get(1));
        String w = "amin";


        }

    }

