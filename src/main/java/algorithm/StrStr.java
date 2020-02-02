package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/38/
 */
public class StrStr {

    public static void main(String[] args) {
        System.out.println(strStr("", ""));
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("mississippi", "pi"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;
        if (needle.length() == haystack.length()) return haystack.equals(needle) ? 0 : -1;

//        byte[] copy = new byte[needle.length()];
//        for (int i = 0; i < haystack.length(); i++) {
//            if (i + needle.length() <= haystack.length()) {
//                System.arraycopy(haystack.getBytes(), i, copy, 0, needle.length());
//                if (new String(copy).equals(needle)) return i;
//            }
//        }
        char[] haystacks = haystack.toCharArray();
        char[] needles = needle.toCharArray();
        for (int i = 0; i < haystacks.length; i++) {
            int len = 0;
            for (int k = i, j = 0; k < haystacks.length && j < needles.length; k++, j++) {
                if (haystacks[k] == needles[j]) {
                    len++;
                }
            }
            if (len == needles.length) return i;
        }

        return -1;
    }
}
