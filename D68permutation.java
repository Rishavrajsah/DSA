import java.util.ArrayList;

public class D68permutation {
    public static void main(String[] args) {
        String str = "abc";
       // permutation("",str);
        ArrayList<String> ans = permutationlist("" , str);
        System.out.println(ans);
        System.out.println(permutationcount("",str));

    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutation(f+ch+s,up.substring(1));
        }
    }
    // returning output as  arraylist
    static ArrayList<String> permutationlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            ans.addAll(permutationlist(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    // counting number of permutation
    static int permutationcount(String p,String up){
        if(up.isEmpty()){
           // System.out.print(p+" ");
            return 1;
        }
        char ch = up.charAt(0);
        int count =0;
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            count = count+permutationcount(f+ch+s,up.substring(1));
        }
        return count;
    }
}
