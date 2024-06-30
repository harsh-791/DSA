package GCD;

import java.util.ArrayList;

public class Prime_GCD1 {
    
    public static boolean checkPrime(int[] sieve,int num){
        int count = 0;
        while(num>1){
            num = num/sieve[num];
            //System.out.println("num="+num);
            count++;
        }
        
        if(count==1)return true;
        return false;
    }
    
    public static int checkgcd(int A){
        int ans = 0;
        while(A>0){
            int num = A%10;//1
            ans = gcd(num,ans);//1
            A = A/10;
            
        }
        
        return ans;
    }
    
    public static int gcd(int A,int B){
        if(B==0)return A;
        return gcd(B,A%B);
    }
    public static void main(String[] args) {
        int A = 15;
        int[] sieve = new int[A+1];
        sieve[0] = 0;
        sieve[1] = 1;
        for(int i=2;i<=A;i++){
            if(sieve[i]==0){
                sieve[i]=i;
                for(int j=i+i;j<=A;j=j+i){
                    if(sieve[j]==0){
                        sieve[j] = i;
                    }
                }
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
       
        for(int i=11;i<=A;i++){
            if(checkPrime(sieve,i)){
                if(checkgcd(i)==1){
                    ans.add(i);
                }
            }
        }
        
       
        
        int n = ans.size();
        int[] finalans = new int[n];
        for(int i=0;i<n;i++){
            finalans[i] = ans.get(i);
        }
        
        for(int i=0;i<finalans.length;i++){
            System.out.println(finalans[i]);
        }
    }
}






