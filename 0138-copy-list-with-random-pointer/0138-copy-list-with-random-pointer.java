/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        //making clones
        Node temp=head;
        while(temp!=null){
            Node nn = new Node(temp.val);
            Node agla = temp.next;
            temp.next=nn;
            nn.next=agla;
            temp=temp.next.next;
        }
        temp=head;
        
        //connecting randoms
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random = temp.random.next;
            }
            temp=temp.next.next;
        }

        //seperating both real and clone lists
        temp=head;
        Node clone_head=head.next;
        while(temp!=null){
            Node clone=temp.next;
            temp.next = clone.next;
            if(clone.next!=null) clone.next = clone.next.next;

            temp=temp.next;
        }
        return clone_head;
    }
}