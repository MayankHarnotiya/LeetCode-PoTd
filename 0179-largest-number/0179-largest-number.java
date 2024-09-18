class Solution {
    public String largestNumber(int[] nums) {
        String[] ans=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(ans,(a,b)->(b+a).compareTo(a+b));
        if(ans[0].equals("0"))
        return "0";
        String largest="";
        for(String s:ans)
        {
            largest+=s;
        }
        return largest;
    }
}