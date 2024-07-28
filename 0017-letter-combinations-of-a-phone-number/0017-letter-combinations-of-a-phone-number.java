class Solution {
    String choices[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    ArrayList<String> ans;

    public void helper(int idx, String digits, StringBuilder curr){
        if(idx==digits.length()){
            ans.add(curr.toString());
            return;
        }
        int currDigit = digits.charAt(idx) - '0';
        for(int i=0;i<choices[currDigit].length();i++){
            curr.append(choices[currDigit].charAt(i));
            helper(idx+1,digits,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        if(digits.length() == 0){
            return ans;
        }
        helper(0,digits,curr);
        return ans;
    }
}