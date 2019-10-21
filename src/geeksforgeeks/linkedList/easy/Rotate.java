package geeksforgeeks.linkedList.easy;

class GfG{
    private void display(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

	public void rotate(Node head,int k){
	    if(head == null || k == 0) return;
	    int count = 1;
	    Node runner = head;
	    while(runner.next != null){
	        count += 1;
	        runner = runner.next;
	    }
	    runner.next = head;
	    k = (k > count) ? (k % count) : k;
	    for(int i=0; i<k; i++) runner = runner.next;
	    head = runner.next;
	    runner.next = null;
	    display(head);
	}
}
