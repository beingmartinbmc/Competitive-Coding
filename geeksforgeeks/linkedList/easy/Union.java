class GFG
{
    private Node head;
    public void insert(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = newNode;
    }
	public Node findUnion(Node head1,Node head2){
	    Set<Integer> setOne = new TreeSet<>();
	    Set<Integer> setTwo = new HashSet<>();
	    Node tempOne = head1, tempTwo = head2;
	    while(tempOne != null){
	        setOne.add(tempOne.data);
	        tempOne = tempOne.next;
	    }
	    while(tempTwo != null){
	        setTwo.add(tempTwo.data);
	        tempTwo = tempTwo.next;
	    }
	    setOne.addAll(setTwo);
	    setOne.forEach(this::insert);
	    return head;
	}
}
