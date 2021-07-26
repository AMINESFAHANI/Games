
//Write a program that prints the numbers from 1 to N except for multiples of 5 where you have to print "Foo" and
//        for the multiples of 7 where you have to print "Bar".
//        For numbers which are multiples of both 5 and 7 print "FooBar".


import java.util.Scanner;

public class Test32 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i=1;i<N+1;i++){
            if(i%5==0 && i%7==0){
                System.out.println("FooBar");
            }
            else if(i%5==0){
                System.out.println("Foo");
            }
            else if (i%7==0){
                System.out.println("Bar");
            }
            else {
                System.out.println(i);
            }
        }
    }
}


