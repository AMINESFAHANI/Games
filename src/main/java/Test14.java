

public class Test14 {
    public static void main(String[] args) throws InterruptedException {
        int n=15;
        Thread.sleep(4000);
        for (int i=0;i<n;i++){
            System.out.print(" ".repeat(n-i-1));
            Thread.sleep(2000);
            for (int j=1;j<i+2;j++){
                System.out.print(j+" ");

            }
            System.out.println("");
        }
    }
}
