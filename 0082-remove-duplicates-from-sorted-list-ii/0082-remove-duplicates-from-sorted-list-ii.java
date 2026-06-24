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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        if(head==null) return null;
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
                set.add(temp.val);
            }
            else temp=temp.next;
        }
        while(head!=null && set.contains(head.val)){head=head.next;}
        temp=head;
        ListNode prev=head;
        int c=0;
        while(temp!=null){
            c++;
            if(set.contains(temp.val)){
                prev.next=temp.next;
                temp=temp.next;
            }
            else{
                temp=temp.next;
                if(c>1) prev=prev.next;
            }
        }
       
        return head;
    }
}