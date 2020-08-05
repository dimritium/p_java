import java.io.*;
import java.util.*;

class BinaryTreeOps {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Node createBinTree(List<Integer> ll) {
        Node head = new Node(10);
        return head;
    }
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<Integer>();
        int arr[] = {10, 12, 15, 25, 30, 36};
        for(Integer i : arr)
            ll.add(i);   
        
        Node head = createBinTree(ll);
        System.out.println(head.data);
    }

}
