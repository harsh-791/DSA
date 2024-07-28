class Solution {
    public void helper(List<List<Integer>> ans, List<Integer> curr, int idx, int nums[]){
        if(idx==nums.length){
            //add curr to ans list;
            ans.add(new ArrayList<>(curr));
            return;
        }
        //do  not take this;
        helper(ans,curr,idx+1,nums);

        //lets take this
        curr.add(nums[idx]);
        helper(ans,curr,idx+1,nums);
        curr.remove(curr.size()-1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(ans,curr,0, nums);
        return ans;
    }
}