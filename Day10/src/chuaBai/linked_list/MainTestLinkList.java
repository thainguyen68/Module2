package bai10.linked_list;

public class MainTestLinkList {
    public static void main(String[] args) {
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
        integerMyLinkedList.addFirst(555);
        integerMyLinkedList.addFirst(888);
        integerMyLinkedList.add(1,1000);
        integerMyLinkedList.add(1,2000);
        integerMyLinkedList.add(1,3000);
        integerMyLinkedList.printList();
        System.out.println("G.trị vừa xóa: " + integerMyLinkedList.remove(2));
        integerMyLinkedList.printList();
    }
}
