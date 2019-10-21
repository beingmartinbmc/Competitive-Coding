package geeksforgeeks.linkedList.easy;

class GfG{
    private void swap(Node node){
        int temp = node.data;
        node.data = node.next.data;
        node.next.data = temp;
    }
    private void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
	public void zigzag(Node head){
	    Node temp = head;
	    boolean smaller = true;
	    while(temp.next != null){
	        if(smaller && temp.data > temp.next.data)
	            swap(temp);
	        else if(!smaller && temp.data < temp.next.data)
	            swap(temp);
	        smaller = !smaller;
	        temp = temp.next;
	    }
	    display(head);
	}
}
