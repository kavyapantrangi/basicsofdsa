

sumOfLeftLeaves(3)
│
├─ sumOfLeftLeaves(9)
│   └─ 9 (left leaf)
│
├─ sumOfLeftLeaves(20)
│   ├─ sumOfLeftLeaves(15)
│   │   └─ 15 (left leaf)
│   └─ sumOfLeftLeaves(7)
│       └─ 0 (no children)
│
└─ Result = 9 (from 9) + 15 (from 20) = 24










/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        
        if(root==null)return 0;
        int sum=0;
        if(root.left!=null)
        {
           if(root.left.left==null&&root.left.right==null)
           {
            //if it is leafnode
            sum+=root.left.val;
           }
           else
           {
            //recursively travesres the left tree until it find the leafnode
            sum+=sumOfLeftLeaves(root.left);
           }

        }
        //recursively for right half
        sum+=sumOfLeftLeaves(root.right);
        return sum;
    }
}

