package Arrays;

import java.util.*;
public class splitMultiset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            k-=1;
            int ans = 0;
            while(n>1){
                ans++;
                n-=k;
            }
            System.out.println(ans);
        }
    }
}

