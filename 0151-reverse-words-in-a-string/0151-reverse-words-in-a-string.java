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
        
        String ans = "";
        while(st.size() != 1) {
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek();
        return ans;
    }
}