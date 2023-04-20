package bai10.array_list;

public class MainTestList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("List ban đầu: ");
        myList.display();
        myList.add(1, 100);
        System.out.println("List sau khi thêm phần tử vào vtri bất kỳ: ");
        myList.display();
        System.out.println("Kiểm tra phần tử tồn tại: ");
        System.out.println(myList.contains(100));
        System.out.println(myList.contains(200));
        System.out.println("Lấy index của phần tử bất kỳ: ");
        System.out.println(myList.indexOf(2));
        System.out.println(myList.indexOf(200));
        System.out.println("Xóa phần tử ở vị trí bất kỳ");
        System.out.println(myList.remove(0));
        myList.display();
        System.out.println("Số lượng phần từ của list: ");
        System.out.println(myList.size());
        System.out.println("Xóa hết phần tử trong list");
        myList.clear();
        myList.display();
    }
}
