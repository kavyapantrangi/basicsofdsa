class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer>current=new ArrayList<>();
        List<List<Integer>>all=new ArrayList<>();
        findpath(root,targetSum,current,all);
        return all;
        
    }
    private static void findpath(TreeNode current,int sum,List<Integer>path,List<List<Integer>>allpaths)
    {
        if(current==null)return;
        path.add(current.val);
        if(current.val==sum&&current.left==null&&current.right==null)
        {
            allpaths.add(new ArrayList<Integer>(path));

        }
        else
        {
            findpath(current.left,sum-current.val,path,allpaths);
             findpath(current.right,sum-current.val,path,allpaths);
        }
        path.remove(path.size()-1);
    }
}
