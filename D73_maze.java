import java.util.ArrayList;

public class D73_maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        paths("", 3, 3);
        System.out.println(pathsRet("",3,3));
        pathsDiagonal("",3,3);

    }

    // return count of no of ways to reach from a point to another
    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }
// print all paths
    static void paths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            paths(p + "D", r - 1, c);
        }
        if (c > 1) {
            paths(p+"R", r, c - 1);
        }

    }
    // print paths in form of list
    static ArrayList<String> pathsRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
//        ArrayList<String> left = new ArrayList<>();
//        ArrayList<String> right = new ArrayList<>();
//        if (r > 1) {
//             left.addAll(pathsRet(p + "D", r - 1, c));
//        }
//        if (c > 1) {
//           right.addAll(pathsRet(p+"R", r, c - 1));
//        }
//        left.addAll(right);
//        return left;
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathsRet(p + "D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathsRet(p+"R", r, c - 1));
        }
        return list;

    }
    // print all paths including diagonals
    static void pathsDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            pathsDiagonal(p + "D", r - 1, c);
        }
        if (c > 1) {
            pathsDiagonal(p+"R", r, c - 1);
        }
        if (c > 1 && r>1) {
            pathsDiagonal(p+"X", r-1, c - 1);
        }
    }
}