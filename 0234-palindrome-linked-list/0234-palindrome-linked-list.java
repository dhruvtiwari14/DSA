/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head,fast=head;
       while(fast.next!=null && fast.next.next!=null){//in order to stop at mid1 incase we have even nodes
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode newhead=reverse(slow.next);
       ListNode t1=head,t2=newhead;
       while(t2!=null){
        if(t1.val!=t2.val){
            return false;
        }
        t1=t1.next;
        t2=t2.next;
       }
       return true;

    }
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode t = head;
        while(t!=null){
            ListNode front=t.next;
            t.next=prev;
            prev=t;
            t=front;
        }
        return prev;
    }
}