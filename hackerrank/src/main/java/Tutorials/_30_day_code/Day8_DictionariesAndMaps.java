package Tutorials._30_day_code;

import java.util.*;

public class Day8_DictionariesAndMaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String,Integer> phoneBookMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here

            phoneBookMap.put(name, phone);
        }

        List<String> output = new ArrayList<>();
        while(in.hasNext()){
            String s = in.next();
            // Write code here

            if(phoneBookMap.containsKey(s)) {
                output.add(s+"="+phoneBookMap.get(s));
            } else {
                output.add("Not found");
            }
        }
        in.close();


        for(String out : output) {
            System.out.println(out);
        }
    }
}
