#Problem: https://leetcode.com/problems/increasing-order-search-tree/

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode prev = null;
        TreeNode head = null;
        TreeNode curr = root;
        while(!st.empty() || curr!=null){
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }

            TreeNode top = st.pop();
            top.left = null;
            if(head == null){
                head = top;
            }

            if(prev !=null){
                prev.right = top;
            }

            prev = top;
            curr = top.right;
        }

        return head;
    }
}
