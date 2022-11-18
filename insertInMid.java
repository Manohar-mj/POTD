class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node newNode=new Node(data);
        if(head == null) return null;
        if (head.next==null) {
            head.next=newNode;
            return head;
        }
        Node first=head;
        Node last=head;
        while(first.next!=null && first.next.next!=null){
            first=first.next.next;
            last=last.next;
        }
        newNode.next=last.next;
        last.next=newNode;
        return head;
        
    }
}
