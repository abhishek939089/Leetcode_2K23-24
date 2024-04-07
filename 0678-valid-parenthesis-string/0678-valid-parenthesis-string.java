class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(')
                open.push(i);
            else if (c == '*')
                starStack.push(i);
            else {
                if (!open.isEmpty())
                    open.pop();
                else if (!starStack.isEmpty())
                    starStack.pop();
                else
                    return false;
            }
        }
        while (!open.isEmpty() && !starStack.isEmpty()) {
            if (open.pop() > starStack.pop())
                return false;
        }
        return open.isEmpty();
    }
}