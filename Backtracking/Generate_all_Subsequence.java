package Backtracking;

import java.util.ArrayList;

public class Generate_all_Subsequence {
    public static void allsubsequence(ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> ans,int index,int[] A){
        if(index==A.length){
            ArrayList<Integer> list = new ArrayList<>(curr);
            ans.add(list);
            return;
        }
        curr.add(A[index]);
        allsubsequence(curr, ans, index+1, A);
        curr.remove(curr.size()-1);
        allsubsequence(curr, ans, index+1, A);
    }

    public static void main(String[] args) {
        int A[] = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        allsubsequence(curr, ans, 0, A);
        System.out.println(ans);
    }
}
