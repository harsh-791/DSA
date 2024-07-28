class Solution {
    ArrayList<String> ans;

    public void helper(int remOpen, int remClose, StringBuilder curr){
        if(remOpen ==0 && remClose == 0){
            ans.add(curr.toString());
            return;
        }

        if(remOpen > 0){
            curr.append("(");
            helper(remOpen-1,remClose,curr);
            curr.deleteCharAt(curr.length()-1);
        }

        if(remClose > remOpen){
            curr.append(")");
            helper(remOpen,remClose-1,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }

    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        helper(n,n,curr);
        return ans;
    }
}