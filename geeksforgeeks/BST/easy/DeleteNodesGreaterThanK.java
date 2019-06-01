class GfG
   {
        private List<Integer> list = new ArrayList<>();
        private void inorder(Node root){
            if(root != null){
                inorder(root.left);
                list.add(root.data);
                inorder(root.right);
            }
        }
        private Node getMax(Node root){
            Node current = root;
            while(current.right != null)
                current = current.right;
            return current;
        }

        private Node delete(Node root, int data){
            if(root == null) return root;
            if(data < root.data) root.left = delete(root.left, data);
            else if(data > root.data) root.right = delete(root.right, data);
            else{
                if(root.left == null && root.right == null) root = null;
                else if(root.left == null) root = root.right;
                else if(root.right == null) root = root.left;
                else{
                    Node temp = getMax(root.left);
                    root.data = temp.data;
                    root.left = delete(root.left, temp.data);
                }
            }
            return root;
        }
        public Node deleteNode(Node root,int x){
            inorder(root);
            for(int i : list){
                if(i >= x){
                    root = delete(root, i);
                }
            }
            return root;
        }
   }
