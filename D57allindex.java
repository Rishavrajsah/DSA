import java.util.ArrayList;

public class D57allindex {
    public static void main(String[] args) {
        int []arr = {2,3,44,44,5,7,2};
        int target = 44;
        ArrayList<Integer> ans = findallindex(arr,target,0,new ArrayList<>());
        System.out.println(ans);
        System.out.println(findallindex2(arr,target,0));

    }
    static ArrayList<Integer> findallindex(int []arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return  findallindex(arr,target,index+1,list);
    }
    static ArrayList<Integer> findallindex2(int []arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = findallindex2(arr,target,index+1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}
