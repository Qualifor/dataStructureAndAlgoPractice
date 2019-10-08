package HashTableAndString;

public class Trie {
    private class Node{
        private Node dic[];
        boolean isEnd;
        public Node(){
            dic = new Node[26];
        }
    }
    private Node root;
    public Trie(){
        root = new Node();
    }
    public void initDic(String[] words){
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            Node temp = root;
            for(int j = 0; j < word.length(); j++){
                char c = word.charAt(j);
                if(temp.dic[c-'a'] == null){
                    System.out.println("cc:" + c);
                    temp.dic[c-'a'] = new Node();
                    //System.out.println(root.dic[c-'a'] == null);
                    temp = temp.dic[c-'a'];
                }else{
                    temp = temp.dic[c-'a'];
                }
            }
            temp.isEnd = true;
        }
    }

    public boolean searchVal(String word){
        for(int j = 0; j < word.length(); j++){
            char c = word.charAt(j);
            if(root.dic[c-'a'] == null){
                //System.out.println("c:" + c);
                return false;
            }else{
                root = root.dic[c-'a'];
            }
        }
        return root.isEnd;
    }
}
