class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>paths=new ArrayList<>();
        if(root!=null)
        {
            findpaths(root,"",paths);
        }
        return paths;
        
    }
    private void findpaths(TreeNode node,String path,List<String>paths)
    {
        if(node!=null)
        {
            path+=Integer.toString(node.val);
            if(node.left==null&&node.right==null)
            {
                paths.add(path);
            }
            else
            {
                path+="->";
                findpaths(node.left,path,paths);
                findpaths(node.right,path,paths);
            }
        }
    }
}
