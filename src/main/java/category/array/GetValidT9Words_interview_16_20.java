package category.array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 面试题 16.20. T9键盘
 * <p>
 * https://leetcode-cn.com/problems/t9-lcci/
 */
public class GetValidT9Words_interview_16_20 {

    public static void main(String[] args) {
        System.out.println(getValidT9Words("8733", new String[]{"tree", "used"}));
        System.out.println(getValidT9Words("2", new String[]{"a", "b", "c", "d"}));
        System.out.println(getValidT9Words("9675973753", new String[]{"alasvnpzur", "znwdgoiwso", "wduzrpnqrv", "ymrkxqdrlf", "epsqjclyqe", "zopjysdqke", "zhfxsdeimz", "eitgrsdnvt"}));
    }

    public static List<String> getValidT9Words(String num, String[] words) {

        Map<Character, Character> map = new HashMap<>();
        map.put('a', '2');
        map.put('b', '2');
        map.put('c', '2');
        map.put('d', '3');
        map.put('e', '3');
        map.put('f', '3');
        map.put('g', '4');
        map.put('h', '4');
        map.put('i', '4');
        map.put('j', '5');
        map.put('k', '5');
        map.put('l', '5');
        map.put('m', '6');
        map.put('n', '6');
        map.put('o', '6');
        map.put('p', '7');
        map.put('q', '7');
        map.put('r', '7');
        map.put('s', '7');
        map.put('t', '8');
        map.put('u', '8');
        map.put('v', '8');
        map.put('w', '9');
        map.put('x', '9');
        map.put('y', '9');
        map.put('z', '9');

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (!map.get(words[i].charAt(j)).equals(num.charAt(j))) {
                    words[i] = "";
                }
            }
        }

        return Arrays.stream(words).filter(word -> word.length() > 0).collect(Collectors.toList());
    }
}
