class LinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void printLL(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public Node insertLL(Node head, int index, int data) {
        Node temp = head;
        int cindex = 0;
        Node prev = null;

        while (cindex < index && temp != null) {
            prev = temp;
            temp = temp.next;
            cindex++;
        }

        if (cindex == index) {
            if (prev == null) {
                Node newHead = new Node(data);
                newHead.next = temp;
                head = newHead;
            } else {
                prev.next = new Node(data);
                prev.next.next = temp;
            }
        } else {
            System.out.println("Invalid Index");
        }
        return head;
    }

    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node head = new Node(2);
        head.next = new Node(3);
        Node newHead = ll.insertLL(head, 3, 5);
        ll.printLL(newHead);
    }
}