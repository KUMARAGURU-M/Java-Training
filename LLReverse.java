class LLReverse {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;

    //insert beg
    public void insertAtBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //insert end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //reverse
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node nex;
        while (curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        head = prev;
    }

    //display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LLReverse sl = new LLReverse(); // FIXED name
        sl.insertAtBeg(5);
        sl.insertAtBeg(6);
        sl.insertAtBeg(7);
        sl.insertAtBeg(8);
        sl.insertAtEnd(9);
        sl.reverse();
        sl.display();
    }
}
