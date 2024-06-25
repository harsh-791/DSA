package Tries;

import java.util.HashMap;

class TrieNode{
    HashMap<Character,TrieNode> map;
    boolean isEndOfWord;

    public TrieNode(){
        map = new HashMap<>();
        isEndOfWord = false;
    }

}

public class prefix {
    public static void insertTrie(TrieNode root,String Word){
        TrieNode current = root;
        for(int i=0;i<Word.length();i++){
            Character ch = Word.charAt(i);
            if(!current.map.containsKey(ch)){
                current.map.put(ch,new TrieNode());
            }
            current = current.map.get(ch);
        }
        current.isEndOfWord = true;
    }

    public static String jhk(TrieNode root,String Word){
        StringBuilder str = new StringBuilder();
        TrieNode curr = root;
        for(int i=0;i<Word.length();i++){
           Character c = Word.charAt(i);
           curr = curr.map.get(c);
           int size = curr.map.size();

           if(size==1){
            str = str.append(c);
            StringBuilder str1 = new StringBuilder();
            int j = i+1;
            TrieNode temp = curr;
            Character ch;
            while(temp!=null && j<Word.length() && temp.map.size()==1){
                ch = Word.charAt(j++);
                str1 = str1.append(ch);
                temp = temp.map.get(ch);
            }
            if(temp!=null && !temp.isEndOfWord){
                str = str.append(str1);
                i = j-1;
                curr = temp;
            }
            if(temp!=null && temp.isEndOfWord){
                return str.toString();
            }
           }
           else{
            if(curr.isEndOfWord){
                return Word;
            }
            str = str.append(c);
           }
        }
       return str.toString();

    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        String[] s = {"beard","beart"};
        for(int i=0;i<s.length;i++){
            insertTrie(root, s[i]);
        }

        String[] pref1 = new String[s.length];

        for(int i=0;i<pref1.length;i++){
            pref1[i] = jhk(root, s[i]);
        }

        for(int i=0;i<pref1.length;i++){
            System.out.println(pref1[i]);
        }

        
        
        

    }
    
}


