package Basics.Strings;

/**
 * https://www.hackerrank.com/challenges/java-string-compare/problem
 */
public class Lexicographical {


    public static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;


        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for(int i = 0; i <= s.length()-k; i++) {
            String currentString = s.substring(i, i+k);


            largest =  currentString.compareTo(largest) >= 1 ? currentString : largest;
            smallest = currentString.compareTo(smallest) <= -1 ? currentString : smallest;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs", 30));
    }
}
