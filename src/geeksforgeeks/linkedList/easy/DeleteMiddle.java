package geeksforgeeks.linkedList.easy;

class GFG
{
   Node Delete(Node head){
       Node slow = head, fast = head, prev = null;
       while(fast != null && fast.next != null){
           prev = slow;
           slow = slow.next;
           fast = fast.next.next;
       }
       prev.next = slow.next;
       return head;
   }
}
