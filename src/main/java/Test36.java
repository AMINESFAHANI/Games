import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test36 {

//    Goal
//    Given a list of words, output only those consisting entirely of alternating consonants and vowels (A, E, I, O, and U), with runs of the same letter treated as a single unit.
//    Input
//    Line 1: N, the number of words to filter
//    Next N lines: the words
//    Output
//    the words that fit the criteria, in order of appearance
//            Constraints
//    Example
//            Input
//     2
//    curriculum
//     vitae
//    Output
//            curriculum

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        ArrayList<Character> v = new ArrayList<Character>();
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('i');
        v.add('u');
        for (int i = 0; i < n; i++) {
            String word = in.nextLine();
            word=word.toLowerCase();
            boolean t1 = false;
            boolean t2 = true;
            for (int j = 0; j < word.length(); j++) {
                if (v.contains(word.charAt(j))) {
                    t1 = true;
                    for (int k = j + 1; k < word.length(); k++) {
                        if (v.contains(word.charAt(k)) && v.indexOf(word.charAt(k)) <= v.indexOf(word.charAt(j))) {
                            t2 = false;
                            break;
                        }
                    }
                    if (!t2) {
                        break;
                    }

                }
            }
            if (t1 && t2) {
                System.out.println(word);
            }
        }
    }
}