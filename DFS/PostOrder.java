class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        traverse(root,ans);
        return ans;
        
    }
    public static void traverse(TreeNode root,List<Integer>res)
    {
        if(root==null)return;
        traverse(root.left,res);
        traverse(root.right,res);
        res.add(root.val);
    }
}
