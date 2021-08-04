import java.util.ArrayList;

public class Test44 {
        /*
         * Complete the 'solve' function below.
         *
         * The function is expected to return a DOUBLE.
         * The function accepts STRING s as parameter.
         */

        public static ArrayList<String> allAnswers = new ArrayList<>();

        public static boolean isPalindrome(String s){
            boolean isPalindrome =true;
            for (int i=0; i<s.length()/2;i++){
                if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                    isPalindrome=false;
                }
            }
            return isPalindrome;
        }


        public static void swaping(String s) {
            if (!allAnswers.contains(s)) {
                allAnswers.add(s);

                    for (int i = 1; i < s.length(); i++) {
                        char[] chars = s.toCharArray();
                        char temp = s.charAt(0);
                        chars[0] = chars[i];
                        chars[i] = temp;
                        swaping(String.valueOf(chars));
                    }
                }
            }

        public static double solve(String s) {
            swaping(s);
            System.out.println(allAnswers.toString());
            int palindroms=0;
            for(String answer:allAnswers){
               if(isPalindrome(answer)){
                  palindroms++;
              }
            }
            System.out.println(palindroms);
            return allAnswers.size();
            }


        public static void main(String[] args){
               System.out.println(solve("bb"));
        }
}
