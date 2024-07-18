class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer>ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n&&j<m)
        {
            if(arr1[i]==arr2[j])
            {
              if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                 i++;
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                
                 if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                 i++;
            }
            else
            {
                 if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }
                 j++;
            }
        }
        while(i<n)
        {
             if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                 i++;
        }
        while(j<m)
        {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }
                 j++;
        }
        return ans;
}
}


Note: If we use the .contains method it will take more time than required  and in this we use ans.isEmpty() and 
  checking if the last element and current array pointer elementy is different or not
.
