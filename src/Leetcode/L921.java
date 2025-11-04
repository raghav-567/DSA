package Leetcode;

import java.util.Stack;

public class L921 {
    public static void main(String[] args) {

    }
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            if(ch == ')'){
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        int count = 0;
        while(!st.isEmpty()){
            st.pop();
            count++;
        }
        return count;
    }
}
