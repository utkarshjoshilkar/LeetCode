class Solution {
    public String removeOuterParentheses(String s) {
        // Stack<Character> st = new Stack<>();
        StringBuilder answer = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ')') {
                counter--;
            }
            if (counter != 0) {
                answer.append(s.charAt(i));
            }
            if (s.charAt(i) == '(') {
                counter++;
            }
        }
        return answer.toString();
    }
}

// Stack<Character> st = new Stack<>();
// for (int i=0;i<s.length();i++) {
// if(s.charAt(i)=='('){
// st.push(')');
// }
// else if(s.charAt(i)=='{'){
// st.push('}');
// }
// else if(s.charAt(i)=='['){
// st.push(']');
// }
// else if(st.isEmpty()||st.pop()!=s.charAt(i)){
// return false;
// }
// }
