import java.util.Arrays;

public class D70_leet_846 {
    public static void main(String[] args) {
        int [] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        System.out.println(isNStraightHand(hand,3));

    }
    // best solution tat take 9ms to runtime
    public static boolean findsucessors(int[] hand, int groupSize, int i, int n) {
        int f = hand[i] + 1;
        hand[i] = -1;
        int count = 1;
        i += 1;
        while (i < n && count < groupSize) {
            if (hand[i] == f) {
                f = hand[i] + 1;
                hand[i] = -1;
                count++;
            }
            i++;
        }
        if (count != groupSize)
            return false;
        else
            return true;
    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0)
            return false;
        Arrays.sort(hand);
        int i = 0;
        for (; i < n; i++) {
            if (hand[i] >= 0) {
                if (!findsucessors(hand, groupSize, i, n))
                    return false;
            }
        }
        return true;
    }
//    public boolean isNStraightHand(int[] hand, int groupSize) {
//        if (hand.length % groupSize != 0) {
//            return false; // If total cards cannot be divided into groups of groupSize
//        }
//
//        Arrays.sort(hand); // Step 1: Sort the hand
//
//        LinkedList<Integer> cards = new LinkedList<>();
//        for (int card : hand) {
//            cards.add(card);
//        }
//
//        while (!cards.isEmpty()) {
//            int firstCard = cards.poll(); // Take the smallest card
//            for (int i = 1; i < groupSize; i++) {
//                int nextCard = firstCard + i;
//                if (!cards.remove((Integer) nextCard)) { // Attempt to find the next card in the group
//                    return false; // If we cannot find the required card, return false
//                }
//            }
//        }
//
//        return true;
//
//
//
//    }

}
