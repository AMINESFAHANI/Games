public class Test42 {

    public static int stringSimilarity(String s) {
            int n=s.length();
            int c = n;
            boolean t=true;
            for (int i=1;i<n;i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    t = false;
                }
            }
            if(t){
                for (int j=0;j<n;j++){
                    c+=j;
                }
                return c;
            }

            int j=0;
            for (int k = 1; k < n; k++) {
            int i=0;
            j++;
            for ( int l=j ; l < n; l++) {
                if (s.charAt(l) == s.charAt(i)) {
                    c++;
                    i++;
                } else {
                    break;
                }
            }
        }
        return c;
    }
    public static void main(String args[]) {
        System.out.println(Test42.stringSimilarity("ababaa"));

    }
}
