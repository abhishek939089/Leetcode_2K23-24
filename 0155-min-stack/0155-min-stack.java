class MinStack {
    int[] stack = new int[10000];
    int[] min = new int[10000];
    int topPtr;
    int minPtr;
    
    public MinStack() {
        topPtr = -1;
        minPtr = -1;
    }
    
    public void push(int val) {
        if(topPtr >= 9999) return;
        stack[++topPtr] = val;
    
        if(minPtr >= 0) {
            if(min[minPtr] >= val) {
                min[++minPtr] = val;
            } else {
                min[minPtr + 1] = min[minPtr];
                minPtr += 1;
            }
        } else { 
            min[++minPtr] = val;
        }
    }
    
    public void pop() {
        if(topPtr < 0) return;
        
        topPtr -= 1;
        if(minPtr >= 0)
            minPtr -= 1;
    }
    
    public int top() {
        return stack[topPtr];
    }
    
    public int getMin() {
        return min[minPtr];
    }
}
