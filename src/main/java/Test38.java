//Goal
//        You got lost in a size 5x5 mini maze.
//        The starting point is (1,1) and the goal is (3,3), always the same.
//
//        The outside of the maze is always a wall.
//
//
//        Please lead to the goal in the shortest distance.
//        The moving method is familiar L, R, U, D.
//
//        There is always one way to answer.
//        Input
//        5 lines: a string LINE where ”.” is a passage and "#" is a wall
//        Output
//        Line 1 : The shortest path.
//        ex. RRDD
//        Constraints
//        LINE length 5
//        Example
//        Input
//        #####
//        #.###
//        #.###
//        #...#
//        #####
//        Output
//        DDRR

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test38 {
    public static char[][] m = new char[5][5];
    public static List<String> responses = new ArrayList<>();


    public static void rout(int x ,int y,String ans){
        if(x==3 && y==3 && ans.length()>=4){responses.add(ans);
        }
        else {
            for (int i=x;i<4;i++){
                for (int j=y;j<4;j++){
                    if(m[i][j]=='.' && m[i+1][j]=='.'){
                        m[i][j]='#';
                        rout(i+1,j,ans+'D');
                    }
                    if(m[i][j]=='.'  && m[i][j+1]=='.'){
                        m[i][j]='#';
                        rout(i,j+1,ans+'R');
                    }
                }
            }
        }
    }


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String line = in.nextLine();
            for (int j=0;j<5;j++){
                m[i][j]=line.charAt(j);
            }
        }
        rout(1,1,"");


        for (String X :responses){
            if(X.length()==4){
                System.out.println(X);
            }
        }
    }
}

