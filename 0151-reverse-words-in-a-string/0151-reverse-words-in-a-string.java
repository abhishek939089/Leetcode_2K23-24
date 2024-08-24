class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String str = "";
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(!str.isEmpty()) {
                    st.push(str);
                }
                str = "";
            }else {
                str += s.charAt(i);
            }
        }
        if (!str.isEmpty()) {
            st.push(str);
        }
        
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) {
            ans.append(st.pop());
            if(!st.isEmpty()) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}