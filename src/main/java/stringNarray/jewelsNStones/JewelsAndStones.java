package stringNarray.jewelsNStones;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbbb";

        System.out.println(solve(J, S));
    }

    public static int solve(String jew, String stone) {
        Set<Character> set = new HashSet<>();
        int result = 0;

        for(char j : jew.toCharArray()) {
            set.add(j);
        }

        for (char s : stone.toCharArray()) {
            if(set.contains(s)) {
                result ++;
            }
        }

        return result;
    };
}
