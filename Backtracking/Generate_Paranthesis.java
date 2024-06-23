package Backtracking;
import java.util.ArrayList;
import java.util.List;

public class Generate_Paranthesis {

    public static void generate( ArrayList<String> ans, int remOpen, int remClose, String S){
        if(remOpen==0 && remClose==0){
            ans.add(S);
            return;
        }

        if(remOpen>0){
            generate(ans, remOpen-1, remClose, S+"(");
        }

        if(remClose > remOpen){
            generate(ans, remOpen, remClose - 1, S+")");
        }
    }

    public static List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        generate(ans,n,n,"");
        return ans;
    }

    public static void main(String[] args) {
        List<String> finalans = generateParenthesis(2);
        System.out.println(finalans);
    }
    
}















