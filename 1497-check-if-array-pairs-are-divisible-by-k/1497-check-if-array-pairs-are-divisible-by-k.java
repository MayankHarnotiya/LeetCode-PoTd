class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n=arr.length;
        int[] freq=new int[k];
        for(int num:arr)
        {
          int rem=(num%k+k)%k;
          freq[rem]++;  
        }
    if(freq[0]%2!=0)
    return false;
    for(int i=1;i<=k/2;i++)
    {
        int counterHalf=k-i;
        if(freq[counterHalf]!=freq[i])
        return false;
    }
    return true;
    }
}