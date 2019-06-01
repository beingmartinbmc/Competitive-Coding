import java.io.*;
import java.util.*;

class BT{
    private class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    Node root;
    int p = 0;

    private Node construct(int[] preorder, int data, int min, int max){
        if(preorder[p] > min && preorder[p] < max){
            Node root = new Node(data);
            p += 1;
            if(p < preorder.length){
                root.left = construct(preorder, preorder[p], min, data);
                root.right = construct(preorder, preorder[p], data, max);
            }
            return root;
        }
        return null;
    }

    private void construct(int[] preorder){
        root = construct(preorder, preorder[0], Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    private void postorder(){
        postorder(root);
        System.out.println();
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String[] inputs = br.readLine().trim().split(" ");
            int[] a = new int[inputs.length + 1];
            for(int i=0; i<inputs.length; i++)
                a[i] = Integer.parseInt(inputs[i]);
            BT bt = new BT();
            bt.construct(a);
            bt.postorder();
            t -= 1;
        }
    }
}
