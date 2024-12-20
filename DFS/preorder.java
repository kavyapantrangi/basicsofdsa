class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();

        traverse(root,list);
        return list;
        
    }
    public void traverse(TreeNode root,List<Integer>res)
    {
        // List<Integer>list=new ArrayList<>();
        if(root==null)
        {
            return ;
        }
        res.add(root.val);
        traverse(root.left,res);
        traverse(root.right,res);
       
    }
}
