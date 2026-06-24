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
        int n=lists.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                list.add(temp.val);
                temp=temp.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr=dummy;
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            ListNode nn = new ListNode(list.get(i));
            curr.next=nn;
            curr=curr.next;

        }
        return dummy.next;
    }
}