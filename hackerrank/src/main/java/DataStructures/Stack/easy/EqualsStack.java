package DataStructures.Stack.easy;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/equal-stacks/problem
 */
public class EqualsStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }

        Integer sum1 = 0;
        Integer sum2 = 0;
        Integer sum3 = 0;

        for(int h1_i= n1 - 1; h1_i >= 0; h1_i--){
            stack1.push(h1[h1_i]);
            sum1+=h1[h1_i];
        }

        for(int h2_i=n2 - 1; h2_i >= 0; h2_i--){
            stack2.push(h2[h2_i]);
            sum2+=h2[h2_i];
        }

        for(int h3_i=n3 - 1; h3_i >= 0; h3_i--){
            stack3.push(h3[h3_i]);
            sum3+=h3[h3_i];
        }

        while (!((sum1.equals(sum2)) && (sum2.equals(sum3)))) {
            if(sum1.intValue() > sum2.intValue() && sum1.intValue() > sum3.intValue()) {
                // sum1
                sum1 = sum1 - stack1.pop();
            } else if(sum2 > sum3) {
                //sum2
                sum2 = sum2 - stack2.pop();
            } else {
                //sum3
                sum3 = sum3 - stack3.pop();
            }
        }

        System.out.println(sum2);
    }
}
