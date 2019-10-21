package geeksforgeeks.linkedList.easy;

import java.util.Arrays;
import java.util.Stack;
import java.io.*;

class SinglyLinkedList {
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    private Node head;

    private Node createHead(int data){
        return new Node(data);
    }

    private void display(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }

    private void display(){
        display(head);
        System.out.println();
    }

    private void add(int data){
        if(head == null){
            head = createHead(data);
            return;
        }
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = new Node(data);
    }

    private void rearrange(){
        Node current = head;
        Node oS = null, oE = null, eS = null, eE = null;
        while(current != null){
            if((current.data & 1) == 0){
                if(eS == null)
                    eS = eE = current;
                else{
                    eE.next = current;
                    eE = current;
                }
            }
            else{
                if(oS == null)
                    oS = oE = current;
                else{
                    oE.next = current;
                    oE = current;
                }
            }
            current = current.next;
        }
        if(eS != null) head = eS;
        if(oS != null && eE != null) eE.next = oS;
        if(oE != null) oE.next = null;
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String[] inputs = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for(int i=0; i<n; i++) a[i] = Integer.parseInt(inputs[i]);
            SinglyLinkedList list = new SinglyLinkedList();
            Arrays.stream(a).forEach(list::add);
            list.rearrange();
            list.display();
            t -= 1;
        }
    }

}
