#Problem: https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/ 
class Solution {
    public Node connect(Node root){
    return helper(root, null);
    }
    public Node helper(Node root, Node parent) {
        if(root==null) return root;
        if(parent!=null && parent.left==root && parent.right!=null)
          root.next = parent.right;
        if(parent!=null&&root.next==null){
            Node iterator = parent.next;
            while(iterator!=null){
                if(iterator.left!=null){
                    root.next=iterator.left;
                    break;
                }
                if(iterator.right!=null){
                    root.next=iterator.right;
                    break;
                }
              iterator = iterator.next;
            }
        }
        helper(root.right, root);
        helper(root.left, root);
        return root;
    }
}
