class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode temp1=head;
        while(temp1!=null && temp1.next!=null){
            temp1=temp.next;
            while(temp1!=null && temp1.val==temp.val )
                temp1=temp1.next;
            temp.next=temp1;
            temp=temp1;
        }
        return head;
    }
}
