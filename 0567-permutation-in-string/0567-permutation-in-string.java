class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m)
        return false;

        int[] f1=new int[26];
        int[] f2=new int[26];

        for(int i=0;i<n;i++)
        {
            char ch=s1.charAt(i);
            f1[ch-'a']++;
        }
        int i=0;
        int j=0;
         while(j<m)
         {
            f2[s2.charAt(j)-'a']++;
            if(j-i+1>n)
            {
                f2[s2.charAt(i)-'a']--;
                i++;
            }
          if (j - i + 1 == n && areSame(f1, f2)) {
                return true;
            }
            j++;
         }
         return false;
    }
      private boolean areSame(int[] f1, int[] f2) {
        for (int k = 0; k < 26; k++) {
            if (f1[k] != f2[k]) {
                return false;
            }
        }
        return true;
    }
}