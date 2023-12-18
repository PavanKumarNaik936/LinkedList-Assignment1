class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        //Creating and merging nodes 
        Node temp=head;
        while(temp!=null){
            Node newnode=new Node(temp.val);
            newnode.next=temp.next;
            temp.next=newnode;
            temp=temp.next.next;
        }
        //Connecting random pointer
        temp=head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }
        //Disconnecting nodes
        Node original=head;
        Node clonehead=head.next;
        Node copy=clonehead;
        while(original!=null){
            original.next=original.next.next;
            original=original.next;
            if(copy.next!=null){
                copy.next=copy.next.next;
                copy=copy.next;
            }
        }
        return clonehead;
       
    }
}
