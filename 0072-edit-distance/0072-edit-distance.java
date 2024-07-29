class Solution {
    int dp[][];
    public int helper(int ptr1, int ptr2, String word1, String word2){
        if(ptr1 >=word1.length()){
            return word2.length() - ptr2;
        }

        if(ptr2 >=word2.length()){
            return word1.length() - ptr1;
        }

        if(word1.charAt(ptr1) == word2.charAt(ptr2)){
            return helper(ptr1+1, ptr2+1, word1, word2);
        }

        if(dp[ptr1][ptr2] != -1){
            return dp[ptr1][ptr2];
        }

        int ans1 = Integer.MAX_VALUE;
        //insert
        if(word1.charAt(ptr1) != word2.charAt(ptr2)){
            ans1 = 1 + helper(ptr1, ptr2+1, word1, word2);
        }

        int ans2 = Integer.MAX_VALUE;
        //delete
        if(word1.charAt(ptr1) != word2.charAt(ptr2)){
            ans2 = 1 + helper(ptr1+1, ptr2, word1, word2);
        }

        int ans3 = Integer.MAX_VALUE;
        //replace
        if(word1.charAt(ptr1) != word2.charAt(ptr2)){
            ans3 = 1 + helper(ptr1+1, ptr2+1, word1, word2);
        }

        return dp[ptr1][ptr2] = Math.min(Math.min(ans1,ans2),ans3);

    }
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,0,word1,word2);
    }
}