class Solution{
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode prev = head;
        while (curr != null) {
            if(curr.next!=null && curr.next.val==curr.val){
            }
            else{
                prev.next = curr.next;
                prev = prev.next;
            }
            curr = curr.next;
        }
        return head;
    }
}