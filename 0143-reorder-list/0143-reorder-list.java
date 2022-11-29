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
    
    public static ListNode middleNode(ListNode head){
            ListNode slow = head;
            ListNode fast = head;
            
            while(fast != null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            
            return slow;
        }
        
        // reverse the list
        public static ListNode reverseList(ListNode head){
            ListNode prev = null;
            ListNode curr = head; 
            
            while(curr!= null){
                ListNode nextofCurr = curr.next;
                curr.next = prev;
                
                prev= curr;
                curr = nextofCurr;
            }
            
            return prev;
        }
        
        // merge 2 list
        public static ListNode merge(ListNode head1, ListNode head2){
            ListNode dummy = new ListNode(-1);
            ListNode curr = dummy;
            
            ListNode p1= head1;
            ListNode p2 = head2;
            
            while(p1 != null && p2 != null){
                ListNode np1 = p1.next;
                ListNode np2 = p2.next;
                
                curr.next = p1;
                curr = curr.next;
                p1 = np1;
                
                curr.next = p2;
                curr = curr.next;
                p2 = np2;
            }
            
            if(p1== null){
                curr.next=p2;
                curr = curr.next;
            }
            
            if(p2==null){
                curr.next = p1;
                curr=curr.next;
            }
            
            return dummy.next;
        }
       
    public void reorderList(ListNode head) {
        
        // find mid
            ListNode mid = middleNode(head);

            // break into 2 after mid
            ListNode head2 = mid.next;
            mid.next = null;


            // reverse the 2nd list 
            head2 = reverseList(head2);


            // merge 2 list
            head = merge(head,head2);
        
        
    }
}