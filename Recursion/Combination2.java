import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);


        List<List<Integer>> result = new ArrayList<>();

        findCombinations(0, candidates, target, result, new ArrayList<>());

        return result;
    }

    private void findCombinations(int index, int[] candidates, int target, List<List<Integer>> result, List<Integer> currentCombination) {
        
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination)); 
            return;
        }

        for (int i = index; i < candidates.length; i++) {
           
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

           
            currentCombination.add(candidates[i]);

            
            findCombinations(i + 1, candidates, target - candidates[i], result, currentCombination);

            
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
