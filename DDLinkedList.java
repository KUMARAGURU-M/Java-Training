public class DDLinkedList {
    static class DDLL {
        static class Node {
            int data;
            Node prev, next;

            Node(int data) {
                this.data = data;
            }
        }

        private Node head = null;
        private Node tail = null;

        //insert Beg
        public void insertBeg(int data) {
            Node newNode = new Node(data);
            newNode.next = head;//as head is null
            if (head == null) {
                tail = newNode;
            } else {
                head.prev = newNode;
            }
            head = newNode;
        }

        //insert End
        public void insertEnd(int data) {
            Node newNode = new Node(data);
            newNode.prev = tail;
            if (tail == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }

        //delete Beg
        public void deleteBeg() {
            head = head.next;
        }

        //delete End
        public void deleteEnd() {
            Node temp = tail.prev;
            temp.next = null;
            temp = tail;
        }

        //insert Ind
        public void insertInd(int data, int ind) {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 1; i < ind - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }

        public void deleteInd(int ind) {
            Node temp = head;
            for (int i = 1; i < ind - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;


        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        DDLL dll = new DDLL();
        dll.insertBeg(3);
        dll.insertEnd(8);
        dll.insertBeg(5);
        dll.insertBeg(4);
        dll.insertBeg(10);
        dll.insertBeg(8);
        dll.display();
        System.out.println();
        dll.insertInd(10, 4);
        dll.display();
        dll.deleteInd(5);
        dll.display();
    }
}
