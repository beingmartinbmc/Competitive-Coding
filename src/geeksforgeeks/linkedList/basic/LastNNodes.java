package geeksforgeeks.linkedList.basic;

class Solution {
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
    public int sum(Node head, int k){
        head = reverse(head);
        Node temp = head;
        int s = 0;
        while(k > 0){
            s += temp.data;
            temp = temp.next;
            k -=1;
        }
        return s;
    }
}
