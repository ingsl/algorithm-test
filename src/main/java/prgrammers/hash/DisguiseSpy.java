package prgrammers.hash;

import java.util.HashMap;
import java.util.Map;

public class DisguiseSpy {
    public static void main(String[] args) {
        DisguiseSpy ds = new DisguiseSpy();

    }

    public int solution(String[][] clothes) {
        int answer = 0;

        Map<String, Integer> clothesMap = new HashMap<>();
        for (String[] cloth: clothes ) {
            clothesMap.put(cloth[1], clothesMap.getOrDefault(cloth[1], 1) + 1);
        }

        answer =1;
        for ( String key : clothesMap.keySet() ) {
            answer = answer*clothesMap.get(key);
        }

        answer = answer-1;

        return answer;
    }
}
