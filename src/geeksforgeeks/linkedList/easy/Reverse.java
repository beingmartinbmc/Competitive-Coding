package geeksforgeeks.linkedList.easy;

class gfg{
   public Node reverse(Node head){
       Node current = head, previous = null, nextNode = null;
       while(current != null){
           nextNode = current.next;
           current.next = previous;
           previous = current;
           current = nextNode;
       }
       return previous;
   }
}
