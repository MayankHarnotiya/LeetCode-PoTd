class Solution {
    public List<Integer> diffWaysToCompute(String s) {
        return solve(s); 
    }

    public List<Integer> solve(String s) {
        List<Integer> res = new ArrayList<>();
        
        // Loop through the string to check for operators
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '+' || c == '-' || c == '*') {
                // Divide the string into two parts
                List<Integer> left = solve(s.substring(0, i));
                List<Integer> right = solve(s.substring(i + 1));
                
                // Combine the results from the left and right parts based on the operator
                for (int x : left) {
                    for (int y : right) {
                        if (c == '+') {
                            res.add(x + y);
                        } else if (c == '-') {
                            res.add(x - y);
                        } else if (c == '*') {
                            res.add(x * y);
                        }
                    }
                }
            }
        }
        
        // If no operators were found, convert the string to an integer and add it to the result list
        if (res.isEmpty()) {
            res.add(Integer.parseInt(s));
        }
        
        return res;
    }
}
