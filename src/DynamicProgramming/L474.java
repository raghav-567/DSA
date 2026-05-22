package DynamicProgramming;

import java.util.HashMap;

public class L474 {
    public static void main(String[] args) {

    }
    HashMap<String,Integer> dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp = new HashMap<>();
        return solve(strs,m,n,0);
    }
    public int solve(String[] strs, int m, int n, int idx ){
        if(idx >= strs.length){
            return 0;
        }
        String key = idx + "," + m + "," + n;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        int len1 = 0;
        if(m >= count0(strs[idx]) && n >= count1(strs[idx])){
            len1 = 1 + solve(strs,m-count0(strs[idx]),n-count1(strs[idx]),idx + 1);
        }
        int len2 = solve(strs,m,n,idx + 1);
        int max = Math.max(len1,len2);
        dp.put(key,max);
        return max;

    }
    private int count1(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }

    private int count0(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') count++;
        }
        return count;
    }
}
