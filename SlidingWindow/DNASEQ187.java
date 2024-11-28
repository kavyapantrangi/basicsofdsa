class Solution {
    public List<String> findRepeatedDnaSequences(String s)
    {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);
            if (seen.contains(substring)) {
                repeated.add(substring);
            } else {
                seen.add(substring);
            }
        }

        return new ArrayList<>(repeated);
    }

    
    }
