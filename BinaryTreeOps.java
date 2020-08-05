import java.io.*;
import java.util.*;

import java.util.Queue;

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

    static Node createBinTree(List<Integer> ll) throws InterruptedException {
        Node head = new Node(ll.get(0));
        Queue<Node> que = new LinkedList<Node>();
        que.add(head);
        Iterator<Integer> it = ll.listIterator(1);
        while (it.hasNext()) {
            Node parent = que.poll();
            parent.left = new Node(it.next());
            que.add(parent.left);
            if (it.hasNext()) {
                parent.right = new Node(it.next());
                que.add(parent.right);
            }
        }
        return head;
    }

    static void printTree(Node head) {
        if(head == null)
            return;
        Queue<Node> que = new LinkedList<Node>();
        que.add(head);
        System.out.println(que.peek().data);
        while(!que.isEmpty()) {
            Node curr = que.poll();
            if(curr.left != null) {
                System.out.print(curr.left.data);
                que.add(curr.left);
            }
            if(curr.right != null) {
                System.out.println(" " + curr.right.data);
                que.add(curr.right);
            }
        }
    }

    static void printDFS(Node head) {
        if(head == null)
            return;
        
        printDFS(head.left);
        printDFS(head.right);
        System.out.println(head.data);

    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> ll = new LinkedList<Integer>();
        int arr[] = { 10, 12, 15, 25, 30, 36 };
        for (Integer i : arr)
            ll.add(i);

        Node head = createBinTree(ll);
        printDFS(head);
        // System.out.println(head.right.data);
    }

}
