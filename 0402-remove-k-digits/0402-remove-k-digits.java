class Solution {
    public String removeKdigits(String num, int k) {
        if (num == null || num.length() == 0 || k == 0) {
            return num;
        }
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<num.length(); i++){
            int curr = num.charAt(i) - '0';
            while (!stack.isEmpty() && k > 0 && stack.peek() > curr) {
                stack.pop();
                k--;
            }
            if(curr == 0 && !stack.isEmpty()){
                stack.push(0);

            }else if(curr != 0){
                stack.push(curr);
            }
        }
        while(!stack.isEmpty() && k > 0){
            stack.pop();
            k--;
        }
        
        String ans  = "";
        while(!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }

        return ans.length() == 0 ? "0" : ans;
    }
}