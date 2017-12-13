package Sorting;

import java.util.*;

public class MaximumTipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int tipA[] = new int[N];
        int tipB[] = new int[N];

        for(int i = 0; i < N; i++) {
            tipA[i] = scanner.nextInt();
        }

        for(int i = 0; i < N; i++) {
            tipB[i] = scanner.nextInt();
        }

        List<Tuple> data = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            Tuple tuple = new Tuple(tipA[i],tipB[i],Math.abs(tipA[i] - tipB[i]));
            data.add(tuple);
        }

        System.out.println(findMaximumTip(N, X, Y, data));
    }

    public static int findMaximumTip(int N, int X, int Y, List<Tuple> data) {
        int sum = 0;

        Collections.sort(data, (t1,t2) -> {
            return t2.getDiff() - t1.getDiff();
        });

        int xCount = 0;
        int yCount = 0;
        for(int j = 0; j < data.size() ; j++) {
            Tuple t = data.get(j);

            if(t.getX() >= t.getY()) {
                if(xCount < X) {
                    xCount++;
                    sum+=t.getX();
                } else {
                    yCount++;
                    sum+=t.getY();
                }

            } else {
                if(yCount < Y ) {
                    yCount++;
                    sum+=t.getY();
                } else {
                    xCount++;
                    sum+=t.getX();
                }

            }

        }

        return sum;
    }

    static class Tuple{
        int x;
        int y;
        int diff;

        public Tuple(int x, int y, int diff) {
            this.x = x;
            this.y = y;
            this.diff = diff;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getDiff() {
            return diff;
        }

        public void setDiff(int diff) {
            this.diff = diff;
        }
    }
}
