package geeksforgeeks.BST.medium;

public static int getCountOfNode(Node root,int l, int r){
    Stack<Node> stack = new Stack<>();
    stack.push(root);
    int count = 0;
    while(!stack.isEmpty()){
        Node current = stack.pop();
        if(current != null){
            if(current.data >= l && current.data <= r)
                count += 1;
            if(current.data > l)
                stack.push(current.left);
            if(current.data < r)
                stack.push(current.right);
        }
    }
    return count;
}
