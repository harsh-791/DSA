class Solution {
    List<List<Integer>> ans;
    HashSet<ArrayList<Integer>> set;
    int EMPTY_CELL = -11;

    public void helper(int idx, int[] nums, ArrayList<Integer> curr){
        if(idx == curr.size()){
            set.add(new ArrayList<>(curr));
            return;
        }

        int currVal = nums[idx];
        for(int i=0;i<curr.size();i++){
            if(curr.get(i) == EMPTY_CELL){
                curr.set(i,currVal);
                helper(idx+1,nums,curr);
                curr.set(i,EMPTY_CELL);
            }
        }

    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        set = new HashSet<>();
        ArrayList<Integer> curr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            curr.add(EMPTY_CELL);
        }
        helper(0,nums,curr);
        ans = new ArrayList<>(set);
        return ans;
    }
}