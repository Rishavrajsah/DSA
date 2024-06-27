import java.util.ArrayList;

public class D71_leetcode_17 {
    public static void main(String[] args) {
        phonePad("","12");
        System.out.println(phonePad2("","12"));
        ArrayList<String> b = new ArrayList<>();
        System.out.println(b);
        System.out.println(phonePadCount("","12"));


    }
    public static void phonePad(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)( 'a'+i );
            phonePad(p+ch,up.substring(1));
        }
    }
    public static ArrayList<String> phonePad2(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)( 'a'+i );
            ans.addAll(phonePad2(p+ch,up.substring(1)));
        }
        return ans;
    }
    // leetcode solution
//    public List<String> letterCombinations(String digits) {
//        // String p ="";
//        // String up = digits;
//        // ArrayList<String> list =new ArrayList<>();
//        // if(digits==""){
//        //     return list;
//        // }else{
//        //   list.addAll(phonePad2(p,up));
//        // }
//        // return list;
//        List<String> list = new ArrayList<>();
//        if (digits.equals("")) {
//            return list;
//        } else {
//            list.addAll(phonePad2("", digits));
//        }
//        return list;
//
//    }
//    public static List<String> phonePad2(String p, String up) {
//        if (up.isEmpty()) {
//            List<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//
//        char digit = up.charAt(0);
//        String letters = getLetters(digit);
//        List<String> ans = new ArrayList<>();
//
//        for (char ch : letters.toCharArray()) {
//            ans.addAll(phonePad2(p + ch, up.substring(1)));
//        }
//
//        return ans;
//    }
//
//    public static String getLetters(char digit) {
//        switch (digit) {
//            case '2': return "abc";
//            case '3': return "def";
//            case '4': return "ghi";
//            case '5': return "jkl";
//            case '6': return "mno";
//            case '7': return "pqrs";
//            case '8': return "tuv";
//            case '9': return "wxyz";
//            default: return "";
//        }
//    }
    public static int phonePadCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0)-'0';
        int count =0;
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)( 'a'+i );
            count = count + phonePadCount(p+ch,up.substring(1));
        }
        return count;
    }

}
