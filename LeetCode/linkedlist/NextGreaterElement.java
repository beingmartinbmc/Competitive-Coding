class Solution {
    private int getSize(ListNode head){
        if(head == null) return 0;
        return getSize(head.next) + 1;
    }
    public int[] nextLargerNodes(ListNode head) {
        int[] output = new int[getSize(head)];
        Stack<ListNode> stack = new Stack<>();
        Map<ListNode, Integer> map = new HashMap<>();
        stack.push(head);
        ListNode current = head;
        current = current.next;
        while(current != null){
            while(!stack.isEmpty() && current.val > stack.peek().val)
                map.put(stack.pop(), current.val);
            stack.push(current);
            current = current.next;
        }
        while(!stack.isEmpty()) map.put(stack.pop(), 0);
        current = head;
        int p =0;
        while(current != null){
            output[p++] = map.get(current);
            current = current.next;
        }
        return output;
    }
}
