package bai10.linked_list;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        numNodes = 0;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        Node holder;
        if (index > 0 || index < numNodes) {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = temp.next.next;
            numNodes--;
            return (E)(holder.getData());
        }
        return null;
    }

    public void printList() {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
