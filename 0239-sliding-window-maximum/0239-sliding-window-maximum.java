class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        int ans[] = new int[n-k+1];

        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        
        ans[0] = nums[dq.peekFirst()];

        for(int exclude = 0, include = k; include < n; exclude++, include++ ){
            if(dq.peek() == exclude){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[include] > nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(include);
            ans[exclude+1] = nums[dq.peekFirst()];
        }

        return ans;
    }
}