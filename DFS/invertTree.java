invertTree(4)
│
├─ invertTree(7)                    <- swap 7's children
│   ├─ invertTree(9)                <- 9 has no children, return 9
│   └─ invertTree(6)                <- 6 has no children, return 6
│
└─ invertTree(2)                    <- swap 2's children
    ├─ invertTree(3)                <- 3 has no children, return 3
    └─ invertTree(1)                <- 1 has no children, return 1




#############solution###############

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;

        
    }
}
