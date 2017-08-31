package helpers;


import java.util.HashMap;
import java.util.Map;

public class Trie {
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void add(String name) {
        TrieNode node = root;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            node = node.addChild(ch);
        }
    }

    public int find(String partial) {
        TrieNode node = root;

        for (int i = 0; i < partial.length(); i++) {
            char ch = partial.charAt(i);
            node = node.getChild(ch);
            if (node == null) {
                return 0;
            }
        }
        return node.getSize();
    }
}

class TrieNode {
    private Map<Character, TrieNode> children = new HashMap<>();
    private int size = 0;

    TrieNode addChild(char ch) {
        children.putIfAbsent(ch, new TrieNode());
        TrieNode node = getChild(ch);
        node.size++;
        return node;
    }

    TrieNode getChild(char ch) {
        return children.get(ch);
    }

    int getSize() {
        return size;
    }
}
