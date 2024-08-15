class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
        char ans='a';
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            // if(letters[mid]==target) return letters[mid];
          if((letters[mid])>target)
            {
                // ans=letters[mid];
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        if(low<letters.length)
        {
            return letters[low];
        }
        return letters[0];
    }
}
