class CustomStack {
    int st[];
    int increments[];
    int idx=-1;
    public CustomStack(int maxSize) {
        st=new int[maxSize];
        increments=new int[maxSize];
    }
    
    public void push(int x) {
        if(idx<st.length-1)
        {
            st[++idx]=x;
        }
    }
    
    public int pop() {
        if(idx<0)
        return -1;
        int top=st[idx]+increments[idx];
        if(idx>0)
        {
            increments[idx-1]+=increments[idx];
        }
        increments[idx]=0;
        idx--;
        return top;
    }
    
    public void increment(int k, int val) {
        if(idx>=0)
        {
            int inc=Math.min(k-1,idx);
            increments[inc]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */