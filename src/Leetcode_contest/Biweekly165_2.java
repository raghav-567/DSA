package Leetcode_contest;
import java.util.*;

public class Biweekly165_2 {
    public static void main(String[] args) {

    }
    public static int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        int n = arrivals.length;
        int discards = 0;
        Deque<int[]> window = new ArrayDeque<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int day = 1; day <= n; day++) {
            int curr = arrivals[day - 1];

            int st = Math.max(1, day - w + 1);
            while (!window.isEmpty() && window.peekFirst()[1] < st) {
                int[] removed = window.pollFirst();
                int r = removed[0];
                count.put(r, count.get(r) - 1);
                if (count.get(r) == 0) {
                    count.remove(r);
                }
            }

            int cCount = count.getOrDefault(curr, 0);

            if (cCount < m) {

                window.addLast(new int[]{curr, day});
                count.put(curr, cCount + 1);
            } else {

                discards++;
            }
        }

        return discards;
    }
}
