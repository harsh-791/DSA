package Arrays;

import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        boolean ans = ((a < j) && (g < d)) && ((b < k) && (h < e)) && ((c < l) && (i < f));
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}

