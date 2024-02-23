import java.util.Objects;
import java.util.Scanner;

public class D27string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println(name);

        // palindrome
        String str = sc.next();
        System.out.println(ispalindrome(str));
        System.out.println(pal(str));

    }
    static  boolean ispalindrome(String str){
        if(str.isEmpty()){  // str.length()==0;
            return true;
        }
        str = str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end){
                return  false;
            }
        }
        return true;
    }
    static boolean pal(String str){
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        String b = builder.reverse().toString();
        if (Objects.equals(str, b)){
            return true;
        }
        return false;
    }
}
