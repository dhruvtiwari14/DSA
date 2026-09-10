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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for (ListNode it : lists) {
            ans = merge(ans, it);
        }
        return ans;
    }
    ListNode merge(ListNode h1,ListNode h2){

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(h1!=null && h2!=null){
            if(h1.val<h2.val){
                temp.next=new ListNode(h1.val);
                h1=h1.next;
                temp=temp.next;
            }
            else{
                temp.next=new ListNode(h2.val);
                h2=h2.next;
                temp=temp.next;
            }
        }
        while(h1!=null){
            temp.next=new ListNode(h1.val);
            h1=h1.next;
            temp=temp.next;
        }
        while(h2!=null){
            temp.next=new ListNode(h2.val);
            h2=h2.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}