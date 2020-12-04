#Problem: https://leetcode.com/problems/linked-list-random-node/

class Solution {
    ListNode head;
    public Solution(ListNode head) {
        this.head = head;
    }
    
    public int getRandom() {
         int n = 1, ans = 0;
        ListNode curr = this.head;
        while (curr != null) {
            if (Math.random() < 1.0 / n)
                ans = curr.val;
            n  += 1;
            curr = curr.next;
        }
        return ans;
    }
}
