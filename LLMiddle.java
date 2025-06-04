class LLMiddle {
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
    public void middle() {
        if (head == null) {
            System.out.println("empty.");
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
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
        LLMiddle sl = new LLMiddle(); // FIXED name
        sl.insertAtBeg(5);
        sl.insertAtBeg(6);
        sl.insertAtBeg(7);
        sl.insertAtBeg(8);
        sl.insertAtEnd(9);
        sl.middle();
        sl.display();
    }
}
