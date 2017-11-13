package Competitions.MorganStandly2017;


import java.util.*;

public class OrderStrings {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<String>> ss = new ArrayList<>(n);
        in.nextLine();

        for (int i = 0; i < n; i++)
        {
            List<String> pair = new ArrayList<>(2);
            pair.add(in.nextLine());
            ss.add(pair);
        }

        int key = in.nextInt();
        boolean reverse = in.nextBoolean();
        String comparison = in.next();
        final boolean numeric = comparison.equals("numeric");

        for (List<String> pair : ss)
        {
            String s = pair.get(0);
            StringTokenizer tokenizer = new StringTokenizer(s);

            for (int i = 1; i < key; i++)
            {
                tokenizer.nextToken();
            }

            String keyString = tokenizer.nextToken();

            if (numeric)
            {
                int i = 0;

                while (i < keyString.length() - 1 && keyString.charAt(i) == '0')
                {
                    i++;
                }

                keyString = keyString.substring(i);
            }

            pair.add(keyString);
        }

        Collections.sort(ss,
                new Comparator<List<String>>()
                {
                    public int compare(List<String> a, List<String> b)
                    {
                        if (numeric && a.get(1).length() != b.get(1).length())
                        {
                            return Integer.compare(a.get(1).length(), b.get(1).length());
                        }

                        return a.get(1).compareTo(b.get(1));
                    }
                });

        if (reverse)
        {
            Collections.reverse(ss);
        }

        for (List<String> pair : ss)
        {
            System.out.println(pair.get(0));
        }
    }
}
