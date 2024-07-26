package Arrays;

import java.util.*;

public class sum0 { 
    
    public static void findSeq(int N, int[] L, int[] R){
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < N; i++){
            minSum += L[i];
            maxSum += R[i];
        }
        
        if (minSum > 0 || maxSum < 0){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        
        int[] ans = new int[N];
        for (int i = 0; i < N; i++){
            ans[i] = L[i];
        }
        
        long curSum = minSum;
        long tarSum = 0;
        
        for (int i = 0; i < N; i++){
            if (curSum == tarSum) {
                break;
            }
            int increase = (int) Math.min(R[i] - L[i], tarSum - curSum);
            ans[i] += increase;
            curSum += increase;
        }      
        for (int i = 0; i < N; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        int[] R = new int[N];
        
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        
        findSeq(N, L, R);
    }
}
