package geeksforgeeks.linkedList.easy;

class GfG
{
    public Node removeDuplicates(Node head){
        Set<Integer> set = new HashSet<>();
        Node temp = head, prev = null;
        while(temp != null){
            if(set.contains(temp.data))
                prev.next = temp.next;
            else{
                prev = temp;
                set.add(temp.data);
            }
            temp = temp.next;
        }
        return head;
    }
}
