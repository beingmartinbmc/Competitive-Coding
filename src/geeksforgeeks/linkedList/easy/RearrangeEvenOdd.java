package geeksforgeeks.linkedList.easy;

class gfg
{
   public Node rearrange(Node head){
       Node odd = head, even = odd.next, start = head.next;
       while(even != null && even.next != null){
           odd.next = even.next;
           odd = odd.next;
           even.next = odd.next;
           even = even.next;
       }
       odd.next = start;
       return head;
   }
}
