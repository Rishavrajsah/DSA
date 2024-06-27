import java.util.ArrayList;

public class D72_Dice_Sum {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(diceRet("",4));
    }
    static void dice(String p , int n){
        if(n==0){
          //  list.add(n)
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=n&&i<=6; i++) {
           // char ch = (char)(i);
            dice(p+i,n-i);
        }
    }
    static ArrayList<String> diceRet(String p , int n){
        if(n==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=n&&i<=6; i++) {
            ans.addAll(diceRet(p+i,n-i));
        }
        return ans;
    }
}
