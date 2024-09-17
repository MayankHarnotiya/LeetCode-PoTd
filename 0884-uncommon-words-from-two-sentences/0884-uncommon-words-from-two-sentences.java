class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       String[] words1=s1.split(" ");
      String[] words2=s2.split(" ");
       HashMap<String,Integer> mp=new HashMap<>();
       for(String word:words1)
       {
        mp.put(word,mp.getOrDefault(word,0)+1);
       } 
        for(String word:words2)
       {
        mp.put(word,mp.getOrDefault(word,0)+1);
       } 
       List<String> res=new ArrayList<>();
       for(HashMap.Entry<String,Integer> entry : mp.entrySet())
       {
        if(entry.getValue()==1)
        {
            res.add(entry.getKey());
        }
       }
       return res.toArray(new String[0]);
    }
}