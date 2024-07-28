class Solution {
    int EMPTY_CELL = -11;

    public void helper(int idx,int nums[],List<Integer> curr,List<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        int currVal = nums[idx];
        for(int i=0;i<nums.length;i++){
            if(curr.get(i)==EMPTY_CELL){
                curr.set(i,currVal);
                helper(idx+1,nums,curr,ans);
                curr.set(i,EMPTY_CELL);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        int n = nums.length;
        for(int i=0;i<n;i++){
            curr.add(EMPTY_CELL);
        }

        helper(0,nums,curr,ans);

        return ans;
    }
}