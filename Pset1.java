import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Pset1 {
    public static boolean isAllCharacterUnique(String str) {
        if (str.length() > 128) {
            return false;
        }
//        int check = 0;
////        for (int i = 0; i< str.length(); i++) {
////            int value = str.charAt(i) - '\0';
////            //System.out.println(value);
////            if ((check & (1 << value)) > 0) {
////                return false;
////            }
////            check |= (1 << value);
////        }
////        return true;
        int[] count = new int[128];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)] ++;
        }

        for (int j : count) {
            //System.out.println(j);
            if (j > 1) {
                return false;
            }
        }
        return true;

    }

    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] count = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)] ++;
            count[s2.charAt(i)] --;
        }

        for (int j : count) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAllCharacterUnique("abcdefghijklmnopqrstuvABC"));
        System.out.println(isAllCharacterUnique("abcdefgghijklmnopqrstuvABC"));

        System.out.println(Pset1.isPermutation("@ab", "a@b"));
        System.out.println(Pset1.isPermutation("abcd", "bcdA"));
    }

}
