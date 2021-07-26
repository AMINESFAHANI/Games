public class Test15 {
    static int c=0;
    static String s="esfahani";
    public static int f(){

        System.out.print(s.charAt(s.length()-1-c));
        c++;
        if (c<= s.length()-1) {
            return f();
        }
    return 0;
    }
    public static void main(String[] args) {
        f();
    }
}
