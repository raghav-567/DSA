import java.util.*;

public class newww {

    // Core function (same logic used in final solution)
    static String solve(int N, String S, int Q, int[][] queries) {
        int[][] pref = new int[N + 1][26];

        for (int i = 0; i < N; i++) {
            int ch = S.charAt(i) - 'a';
            for (int c = 0; c < 26; c++) pref[i + 1][c] = pref[i][c];
            pref[i + 1][ch]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Q; i++) {
            int L = queries[i][0];
            int R = queries[i][1];

            int len = R - L + 1;

            if (len == 1) {
                sb.append("NO\n");
                continue;
            }

            int distinct = 0;
            for (int c = 0; c < 26; c++) {
                int count = pref[R][c] - pref[L - 1][c];
                if (count > 0) distinct++;
            }

            if (distinct == 1) sb.append("NO\n");
            else sb.append("YES\n");
        }

        return sb.toString();
    }

    // Automated testing
    static void runTests() {
        // Test 1: single char string
        {
            int N = 1;
            String S = "a";
            int[][] q = {{1,1}};
            String out = solve(N, S, 1, q);
            assert out.equals("NO\n");
        }

        // Test 2: all same characters
        {
            int N = 5;
            String S = "aaaaa";
            int[][] q = {{1,5}, {2,4}, {3,3}};
            String out = solve(N, S, 3, q);
            assert out.equals("NO\nNO\nNO\n");
        }

        // Test 3: two different characters
        {
            int N = 2;
            String S = "ab";
            int[][] q = {{1,2}};
            String out = solve(N, S, 1, q);
            assert out.equals("YES\n");
        }

        // Test 4: palindrome-like substring but distinct > 1
        {
            int N = 4;
            String S = "abba";
            int[][] q = {{1,4}, {2,3}};
            String out = solve(N, S, 2, q);
            assert out.equals("YES\nYES\n");
        }

        // Test 5: mixed string
        {
            int N = 6;
            String S = "abcabc";
            int[][] q = {{1,1}, {1,2}, {1,3}, {1,6}, {2,5}};
            String out = solve(N, S, 5, q);
            assert out.equals("NO\nYES\nYES\nYES\nYES\n");
        }

        // Test 6: boundaries L=1, R=N
        {
            int N = 7;
            String S = "zzzyzzz";
            int[][] q = {{1,7}, {1,3}, {4,4}, {5,7}};
            String out = solve(N, S, 4, q);
            // 1..7 has y and z => YES
            // 1..3 all z => NO
            // 4..4 length 1 => NO
            // 5..7 all z => NO
            assert out.equals("YES\nNO\nNO\nNO\n");
        }

        // Test 7: alternating characters
        {
            int N = 8;
            String S = "abababab";
            int[][] q = {{1,8}, {2,7}, {3,6}, {4,5}};
            String out = solve(N, S, 4, q);
            assert out.equals("YES\nYES\nYES\nYES\n");
        }

        // Test 8: random distinct substring
        {
            int N = 5;
            String S = "abcde";
            int[][] q = {{1,5}, {2,2}, {4,5}};
            String out = solve(N, S, 3, q);
            assert out.equals("YES\nNO\nYES\n");
        }

        System.out.println("ALL TEST CASES PASSED");
    }

    public static void main(String[] args) {
        // Uncomment this line if you want to run built-in tests locally:
        // runTests();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int Q = sc.nextInt();

        int[][] pref = new int[N + 1][26];

        for (int i = 0; i < N; i++) {
            int ch = S.charAt(i) - 'a';
            for (int c = 0; c < 26; c++) pref[i + 1][c] = pref[i][c];
            pref[i + 1][ch]++;
        }

        StringBuilder sb = new StringBuilder();

        while (Q-- > 0) {
            int L = sc.nextInt();
            int R = sc.nextInt();

            int len = R - L + 1;

            if (len == 1) {
                sb.append("NO\n");
                continue;
            }

            int distinct = 0;
            for (int c = 0; c < 26; c++) {
                int count = pref[R][c] - pref[L - 1][c];
                if (count > 0) distinct++;
            }

            if (distinct == 1) sb.append("NO\n");
            else sb.append("YES\n");
        }

        System.out.print(sb.toString());
    }
}