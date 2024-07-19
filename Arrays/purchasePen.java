package Arrays;

import java.util.*;
public class purchasePen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        String C = sc.next();
        if(C.equals("Red")){
            System.out.println(Math.min(G,B));
        }
        else if(C.equals("Green")){
            System.out.println(Math.min(R,B));
        }
        else{
            System.out.println(Math.min(G,R));
        }
    }
}

