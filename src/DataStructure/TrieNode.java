package DataStructure;

/*  实现 Trie Tree（前缀树）和它的基本功能
    假设用于只有 26 个小写字母的场景
    root 连下来第 1 层有 26 个 TrieNode，每个 node 包含下一层的拥有 26 个 TrieNode 的数组
 */

public class TrieNode {

    // 变量声明
    TrieNode[] children;

    String word;

    private final int R = 26;

    // 判断是否已经遍历到结尾
    private boolean isEnd;

    // 标记当前 TrieNode 在 Trie Tree 里是否为字母的结尾（也就是最后一个字母）
    boolean isWord;

    // 无参数构造函数
    public TrieNode() {
        children = new TrieNode[R];
        isWord = false;
        word = "";
    }

    // 类似 HashMap 的三个基本操作

    public boolean containsKey(char ch) {
        return children[ch - 'a'] != null;
    }

    public TrieNode get(char ch) {
        return children[ch - 'a'];
    }

    public void put(char ch, TrieNode node) {
        children[ch - 'a'] = node;
    }

    // 以下功能用于匹配前缀

    public void setEnd() {
        isEnd = true;
    }

    public boolean isEnd() {
        return isEnd;
    }
}
