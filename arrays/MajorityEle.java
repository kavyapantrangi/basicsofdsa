BruteForce approach:
class Solution {
    public int majorityelement(int[] nums) {
        int n=nums.length;
        // int count=0;
        for(int i=0;i<n;i++)
        {
        int count=0;
        for(int j=0;j<n;j++)
        {
            if(nums[i]==nums[j])count++;
        }
        if(count>n/2)
        return nums[i];
        }
        return 0;
       
        
    }
}



//time complexity:O(n*2)
//space :O(1)

case 2:using Map:Better solution

class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
    
for(int i:map.keySet())
{
    if(map.get(i)>n/2)
    {
        return i;
    }
}
return  0;
        
    }
}
time complexity:O(Nlogn)+O(N)
Space Complexity:O(N)--for storing the elements 


case 3:optimal solution
  Moore voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int ele=nums[0];
        for(int i=0;i<n;i++)
        {
             if(count==0)
            {
                ele=nums[i];
            }
            if(ele==nums[i])count++;
            else count--;
           

        }
        return ele;
       
        
    }
}











  
