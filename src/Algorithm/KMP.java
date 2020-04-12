package Algorithm;

/*  KMP(Knuth–Morris–Pratt)
    Time = O(m + n)，m 是主串的长度，n 是模式串的长度
    Space = O(n)，需要构造关于模式串的 next[n] 数组（部分匹配表）
    KMP 的核心是部分匹配表，目的是存储 pattern 中正确前缀的长度，使得该前缀同时也是它的后缀。
    当我们用 pattern 匹配一个主串，已经匹配了前 s 个位置，此时匹配失败，则 s 的部分匹配表值就是 pattern 中可能从此处继续匹配的最长前缀。
    这样，我们就不必从头开始匹配，而是可以从已经匹配的前缀继续。

                    b b c a b c d a b a b c d a b c d a b d
                          a b c d a b d
    Brute Force:    b b c a b c d a b a b c d a b c d a b d
                            a b c d a b d
    KMP:            b b c a b c d a b a b c d a b c d a b d
                                  a b c d a b d
    next 数组考虑的是除当前字符外的最长相同前缀后缀，即将各个前缀后缀的公共元素的最大长度右移一位，初值赋为-1

          a b c d a b d
    next -1 0 0 0 0 1 2

    next[j] = k 代表 pattern[j] 之前的模式串子串中，有长度为 k 的相同前缀和后缀
    有了 next 数组，当 pattern 中 j 处的字符失配时，下一步用 next[j] 处的字符继续跟 text 匹配
    相当于 pattern 向右移动 j - next[j] 位
 */

public class KMP {
    public static void main(String[] args) {
        String text = "bbcabcdababcdabcdabd";
        String pattern = "abcdabd";
        int m = text.length();
        int n = pattern.length();
        int[] next = kmpPreprocess(pattern);

        int i = 0;
        int k = 0;
        while (i < m && k < n) {
            if (k == -1 || text.charAt(i) == pattern.charAt(k)) {
                i++;
                k++;
            } else {
                k = next[k];
            }
        }
        if (k == pattern.length()) {
            System.out.println(i - k);
        } else {
            System.out.println("no match");
        }
    }

    // 构建属于 pattern 的 next 数组
    // next[j] = k: pattern[0 ~ k-1] = pattern[j-k ~ j-1]
    private static int[] kmpPreprocess(String pattern) {
        int n = pattern.length();      // n = 7
        int[] next = new int[n];
        next[0] = -1;
        int k = -1;
        int j = 0;

        while (j < n - 1) {         // j < 6
            // k 表示前缀，j 表示后缀
            if (k == -1 || pattern.charAt(k) == pattern.charAt(j)) {
                k++;            // k = 0;       k = 0;        k = 0;       k = 0;       k = 1;       k = 2;
                j++;            // j = 1;       j = 2;        j = 3;       j = 4;       j = 5;       j = 6;
                next[j] = k;    // next[1] = 0; next[2] = 0   next[3] = 0; next[4] = 0; next[5] = 1; next[6] = 2
            } else {
                // 相当于 reset
                k = next[k];    // k = next[0] = -1; k = next[0] = -1; k = -1; k = -1;
            }
        }
        return next;
    }
}
