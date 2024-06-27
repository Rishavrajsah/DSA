public class D64skip_a {
    public static void main(String[] args) {
        String input = "abdadac";
//        String result = removeCharacter(input, 'a');
//        String result2 = removeCharacter2(input, 'a');
//        System.out.println(result);  // Output: bdd
//        System.out.println(result2);
//        System.out.println(removeCharacter3(input,"",0,'a'));
//        skip("",input);
        System.out.println(skip2(input));

    }
// method 1
    public static String removeCharacter(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        return result;
    }
    // method 2
    public static String removeCharacter2(String str, char ch) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
    // method 3
    public static String removeCharacter3(String str , String ans , int i, char ch){
        if(i>=str.length()){
            return ans;
        }
        if (str.charAt(i) != ch) {
            ans += str.charAt(i);
        }
        return removeCharacter3(str,ans,i+1,ch);

    }
    // method 4 Kunal method
    public static void skip(String ans , String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            skip(ans,str.substring(1));
        }else{
            skip(ans+ch,str.substring(1));
        }
    }
    // method 5
    public static String skip2( String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            return skip2(str.substring(1));
        } else {
            return ch + skip2(str.substring(1));
        }
    }
}

