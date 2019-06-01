class Solution(object):
    def deleteDuplicates(self, head):
        if head is None or head.next is None:
            return head
        current = head
        while current.next is not None:
            if current.val == current.next.val:
                current.next = current.next.next
            else:
                current = current.next
        return head
        
