class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        if( head.next == null) return head;

        ListNode temp = null;
        ListNode x = head , y = head;
        Boolean flag = false;

        while(x!=null && x .next != null){
            if(x.val == x.next.val){
                while(x.next!=null && x.val == x.next.val) x=x.next;
                y.next=x.next;
            }
            else {
                if(flag == false){ temp = x; flag = true;}
                y=x;
            }
            x=x.next;
        }
        if(flag == false) temp = x;
        return temp;
    }
}