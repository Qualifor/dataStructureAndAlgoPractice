import HashTableAndString.Trie;
import org.junit.Test;

public class testTrie {
    @Test
    public void testTrie(){
        Trie dic = new Trie();
        String[] words = {"one", "two", "three"};
        dic.initDic(words);
        System.out.println(dic.searchVal("a"));
    }
}
