package bai10.linked_list;

public class Node {
    public Node next;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
