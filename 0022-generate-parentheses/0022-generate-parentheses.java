class Solution {
    ArrayList<String> ans;

    public void helper(int remOpen, int remClose, String curr){
        if(remOpen ==0 && remClose == 0){
            ans.add(curr.toString());
            return;
        }

        if(remOpen > 0){
            helper(remOpen-1,remClose,curr+"(");
        }

        if(remClose > remOpen){
            helper(remOpen,remClose-1,curr+")");
        }
    }

    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        helper(n,n,"");
        return ans;
    }
}