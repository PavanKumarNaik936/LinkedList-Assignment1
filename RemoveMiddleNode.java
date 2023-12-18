class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null ||head.next==null)
            return null;
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int k=0;
        temp=head;
        while(temp!=null){
            if(k==(c/2)-1){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            k++;
        }
        return head;
    }
}
