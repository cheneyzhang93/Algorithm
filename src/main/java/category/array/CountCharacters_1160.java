package category.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 1160. 拼写单词
 * <p>
 * https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
 */
public class CountCharacters_1160 {

    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
        System.out.println(countCharacters(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr"));
    }

    public static int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charsMap = new HashMap<>(chars.length());
        for (char c : chars.toCharArray()) {
            charsMap.put(c, charsMap.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        for (String word : words) {
            Map<Character, Integer> wordMap = new HashMap<>(word.length());
            for (char c : word.toCharArray()) {
                wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
            }
            boolean flag = true;
            for (char c : word.toCharArray()) {
                Integer wordCharCount = wordMap.getOrDefault(c, 0);
                Integer charsCharCount = charsMap.getOrDefault(c, 0);
                if (wordCharCount > charsCharCount) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count += word.length();
            }
        }
        return count;
    }
}
