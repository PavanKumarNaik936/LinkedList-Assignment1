class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head=Reverse(head);
        head=deletetAtKth(head,n);
        head=Reverse(head);
        return head;
    }
    ListNode Reverse(ListNode head){
		if(head==null||head.next==null)
			return head;
		ListNode prev=null;
		ListNode curr=head;
		ListNode temp=null;
		while(curr!=null){
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
    ListNode deletetAtKth(ListNode head,int K){
        if(head==null||head.next==null)
            return null;
        if(K==1)
            return head.next;
		ListNode temp=head;
		int c=1;
		while(temp!=null){
			if(c==K-1){
				temp.next=temp.next.next;
				break;
			}
			temp=temp.next;
			c++;
		}
		return head;
	}
}
