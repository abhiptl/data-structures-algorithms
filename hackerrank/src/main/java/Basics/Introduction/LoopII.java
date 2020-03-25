package Basics.Introduction;

import java.util.Scanner;

public class LoopII {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] sol = new int[t][];
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int tSol[] = new int[n];
            int sum = 0;
            for(int m=0; m<n; m++) {
                if(m == 0) {
                    sum = a;
                }
                sum = (int) (sum + (Math.pow(2,m) * b));
                tSol[m] = sum;
            }

            sol[i] = tSol;
        }
        in.close();

        for(int i=0; i<t; i++){
            int[] data = sol[i];
            for(int j=0; j< data.length; j++) {
                System.out.print(sol[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
