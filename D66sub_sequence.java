import java.util.ArrayList;

public class D66sub_sequence {
    public static void main(String[] args) {
        subSeq("","123");
        System.out.println(subSeq2("","abc"));
        subSeqAscii("","abc");
        System.out.println(subSeq2Ascii("","abc"));
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p +" ");
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch , up.substring(1));
        subSeq(p,up.substring(1));
    }
    // return an array list
    static ArrayList<String> subSeq2(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq2(p+ch , up.substring(1));
        ArrayList<String> right = subSeq2(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    // subsequence with ASCII values
    static void subSeqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.print(p +" ");
            return;
        }
        char ch = up.charAt(0);
        subSeqAscii(p+ch , up.substring(1));
        subSeqAscii(p,up.substring(1));
        subSeqAscii(p+ (ch+0) ,up.substring(1));
    }
    //
    static ArrayList<String> subSeq2Ascii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subSeq2Ascii(p+ch , up.substring(1));
        ArrayList<String> second = subSeq2Ascii(p,up.substring(1));
        ArrayList<String> third = subSeq2Ascii(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
