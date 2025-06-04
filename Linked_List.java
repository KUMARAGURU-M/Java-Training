class LLImplementation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;

    public void insertBeg(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insertPos(int data, int pos) {
        if (pos <= 1 || head == null) {
            insertBeg(data);
            return;
        }

        Node node = new Node(data);
        Node temp = head;
        pos--;

        while (temp != null && pos > 1) {
            temp = temp.next;
            pos--;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        node.next = temp.next;
        temp.next = node;
    }

    public void DeleteBeg() {
        if (head == null) return;
        head = head.next;
    }

    public void DeleteLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public void DeletePos(int pos) {
        if (head == null || pos <= 1) {
            DeleteBeg();
            return;
        }

        Node temp = head;
        pos--;

        while (temp.next != null && pos > 1) {
            temp = temp.next;
            pos--;
        }

        if (temp.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        temp.next = temp.next.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    //middle element
    public void middle(){
        Node curr= head;
        if (curr == null) {
            System.out.println("List is empty.");
            return;
        }
        Node fast=curr;
        Node slow=curr;
        while(fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }

    //reverse
    public void reverse(){
        Node curr= head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // delete every k node
    public void delete_K_node(int k){
        Node curr= head;

    }
}

public class Linked_List {
    public static void main(String[] args) {
        LLImplementation ll =new LLImplementation();
        ll.insertBeg(5);
        ll.insertBeg(4);
        ll.insertLast(8);
        ll.insertBeg(10);
        ll.insertPos(10,1);
        ll.display();
//        ll.DeleteBeg();
//        System.out.println();
//        ll.display();
//        ll.DeleteLast();
//        System.out.println();
//        ll.display();
//        ll.DeletePos(1);
//        System.out.println();
//        ll.display();
        ll.middle();
        ll.reverse();
        ll.display();

    }
}