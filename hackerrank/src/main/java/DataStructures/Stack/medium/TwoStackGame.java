package DataStructures.Stack.medium;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/game-of-two-stacks/problem
 */
public class TwoStackGame {
    private static final Scanner scanner = new Scanner(System.in);


    static long twoStacks(long x, long[] a, long[] b) {
        int n = a.length - 1;
        int m = b.length - 1;

        for(int i=1;i<=n;i++)
        {
            a[i]=a[i]+a[i-1];
        }
        for(int i=1;i<=m;i++)
        {
            b[i]=b[i]+b[i-1];
        }

        int res=0;
        for(int i=0;i<=n;i++)
        {
            if(a[i]<=x)
            {
                long curr=x-a[i];int low=0,high=m;
                while(low<high)
                {
                    int mid=(low+high+1)>>1;
                    if(b[mid]<=curr)
                    {
                        low=mid;
                    }
                    else
                    {
                        high=mid-1;
                    }
                }
                res=Math.max(res,i+low);
            }
        }

        return  res;
    }

    public static void main(String[] args) {
        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            long x = Long.parseLong(nmx[2].trim());

            long[] a = new long[n+1];

            String[] aItems = scanner.nextLine().split(" ");

           for(int i = 1; i <=n; i++) {
               a[i] = Long.parseLong(aItems[i-1].trim());
           }

            long[] b = new long[m+1];

            String[] bItems = scanner.nextLine().split(" ");

            for(int i = 1; i <=m; i++) {
                b[i] = Long.parseLong(bItems[i-1].trim());
            }

            long result = twoStacks(x, a, b);

            System.out.println(result);
        }
    }
}
