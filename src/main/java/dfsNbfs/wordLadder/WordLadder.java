package dfsNbfs.wordLadder;

import java.lang.reflect.Array;
import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        WordLadder wl = new WordLadder();

        String words[] = {"hot", "dot", "dog", "lot", "log", "cog"};
        List<String> wordList = Arrays.asList(words);

        System.out.println(wl.ladderLength("hit", "cog", wordList));
    }

    private int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList == null || !wordList.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        Set<String> dict = new HashSet<>(wordList);

        queue.offer(beginWord);
        dict.add(endWord);
        dict.remove(beginWord);
        int lvl = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String str = queue.poll();

                if (str.equals(endWord)) return lvl;
                for (String neighbor : neighbors(str, wordList)) {
                    queue.offer(neighbor);
                }
            }
            lvl++;
        }
        return lvl;
    }

    private List<String> neighbors(String s, List<String> wordList) {
        List<String> res = new LinkedList<>();
        Set<String> dict = new HashSet<>(wordList);

        for (int i = 0; i < s.length(); i++) {
            char[] chars = s.toCharArray();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                chars[i] = ch;
                String word = new String(chars);
                if (dict.remove(word)) {
                    res.add(word);
                }
            }
        }
        return res;
    }
}
