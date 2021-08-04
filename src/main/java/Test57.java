import java.util.Scanner;

public class Test57 {


        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            String ans = "A";
            String temp = "";
            for(int i = 0; i < n; i++)
            {
                System.out.println(ans);
                for(int j = 0; j < ans.length(); j++)
                {
                    if(ans.charAt(j) == 'A')
                    {
                        temp += "AB";

                    }
                    else
                    {
                        temp+= 'A';
                    }
                }
                ans = temp;
                temp = "";

            }

        }
    }

