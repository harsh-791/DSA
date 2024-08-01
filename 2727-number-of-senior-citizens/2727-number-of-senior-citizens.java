class Solution {
    public int countSeniors(String[] details) {
        int N = details.length;
        int ans = 0;
        for(int i=0;i<N;i++){
            String str = "";
            str+=details[i].charAt(11);
            str+=details[i].charAt(12);

            int num = Integer.parseInt(str);
            if((num) > 60)ans++;

        }
        return ans;
    }
}