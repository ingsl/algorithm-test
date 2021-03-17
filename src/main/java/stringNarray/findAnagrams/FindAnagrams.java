package stringNarray.findAnagrams;

import java.util.HashMap;
import java.util.Map;

public class FindAnagrams {
    public static void main(String[] args) {
        int[] a = {11,27,45,31,50};
        int[] b = {50,11,31,45,27};

        FindAnagrams findAnagrams = new FindAnagrams();

        findAnagrams.solve(a, b);
    }

    private int[] solve(int[] a, int[] b) {

        int[] result = new int[a.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < b.length; i++) {
            map.put(b[i], i);
        }

        for(int i =0; i < a.length; i++) {
            result[i] = map.get(a[i]);
        }
        return result;
    };
}
