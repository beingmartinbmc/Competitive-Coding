package geeksforgeeks.linkedList.easy;

class GfG
{
    public boolean isPalindrome(Node head){
        Node fast = head, slow = head;
        Stack<Integer> stack = new Stack<>();
        while(fast != null && fast.next != null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null) slow = slow.next;
        while(slow != null){
            if(stack.pop() != slow.data) return false;
            slow = slow.next;
        }
        return true;
    }
}