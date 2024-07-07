package Arrays;

import java.util.*;
public class power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        for(int i=2; i<N;i++){
            int power = 2;
            while(power<N){
                if(Math.pow(i,power)<=N){
                    System.out.println(Math.pow(i,power));
                    count++;
                    power++;
                }
                else{
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
