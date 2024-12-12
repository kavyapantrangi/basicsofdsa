class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        traverse(root,ans);
        return ans;

    }

        private void traverse(TreeNode root,List<Integer>res)
        {
            if(root==null)return;
            traverse(root.left,res);
            res.add(root.val);
            traverse(root.right,res);
        }
        

        
    
}
