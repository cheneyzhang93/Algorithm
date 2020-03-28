package algorithm.everyday;


import java.util.*;

/**
 * https://leetcode-cn.com/problems/short-encoding-of-words/
 */
public class MinimumLengthEncoding {

    public static void main(String[] args) {
        System.out.println(minimumLengthEncoding(new String[]{"time", "me", "bell"}));
        System.out.println(minimumLengthEncoding(new String[]{"time", "me", "ame"}));
        System.out.println(minimumLengthEncoding(new String[]{"time", "abbell", "bell"}));
        System.out.println(minimumLengthEncoding(new String[]{"time", "abbell"}));
        System.out.println(minimumLengthEncoding(new String[]{"time"}));
        System.out.println(minimumLengthEncoding(new String[]{"me", "time"}));
    }

    public static int minimumLengthEncoding(String[] words) {
        if (words == null || words.length == 0) {
            return 0;
        }

//        for (int i = 0; i < words.length; i++) {
//            String currWord = words[i];
//            for (int j = 0; j < words.length; j++) {
//                if (j != i) {
//                    String compare = words[j];
//                    boolean ignore = !(currWord.length() == 0 || compare.length() == 0);
//                    boolean isContains = currWord.contains(compare);
//                    boolean checkLen = currWord.indexOf(compare) + compare.length() == currWord.length();
//                    if (ignore && isContains && checkLen) {
//                        words[j] = "";
//                    }
//                }
//            }
//        }

        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        Set<String> copy = new HashSet<>(wordSet);
        wordSet.forEach(word -> {
            for (int i = 1; i < word.length(); i++) {
                copy.remove(word.substring(i));
            }
        });
        return copy.stream().mapToInt(word -> word.length() + 1).sum();
    }
}
