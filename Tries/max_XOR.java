package Tries;

import java.util.ArrayList;
import java.util.HashMap;

class trie{
    HashMap<Integer,trie> map;
    boolean isEndOfNum;
    //boolean repeat;

    public trie(){
        map = new HashMap<Integer,trie>();
        isEndOfNum = false;
    }

}

public class max_XOR{

    

        public static void insert_Boolean(trie root,int num){
            trie curr = root;
            for(int i=31;i>=0;i--){
                int n;
                if((num&(1<<i))==0){
                    n = 0;
                }
                else{
                    n = 1;
                }
                if(!curr.map.containsKey(n)){
                    curr.map.put(n,new trie());
                }
                curr = curr.map.get(n);
            }

        }

        public static int max_XOR(trie root,int num){
            trie curr = root;
            int ans = 0;
            for(int i=31;i>=0;i--){
                int n = num&(1<<i);
                n = n>>i;
                int  y;
                if(n==0){
                    y = 1;
                }
                else{
                    y = 0;
                }
                if(curr.map.containsKey(y)){
                    ans = ans | (y<<i);
                    curr = curr.map.get(y);
                }
                else{
                    ans = ans | (n<<i);
                    curr = curr.map.get(n);
                }
            }
           return ans;
        }


    public static void main(String[] args) {
       

        trie root = new trie();
        int A[] = {4,3,2,7};
        for(int i=0;i<A.length;i++){
            insert_Boolean(root, A[i]);
        }
        int ans = 0;
        for(int i=0;i<A.length;i++){
            int cur = max_XOR(root, A[i]);
            if((cur^A[i])>ans){
                ans = cur^A[i];
            }
        }

        System.out.println(ans);
    }
}
