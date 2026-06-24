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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        int l=len(head);
        int[] arr=new int[len(head)];
        int z=0;
        while(temp!=null){
            arr[z++]=temp.val;
            temp=temp.next;
        }
        ArrayList<Integer> list =  new ArrayList<>();
        int max=0;
        for(int i=l-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
               list.add(max);
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        Collections.reverse(list);
        for(int i=0;i<list.size();i++){
            ListNode nn = new ListNode(list.get(i));
            curr.next=nn;
            curr=curr.next;
        }
        return dummy.next;

    }
    int len(ListNode head){
        ListNode t = head;
        int l=0;
        while(t!=null){
            l++;
            t=t.next;
        }
        return l;
    }
}