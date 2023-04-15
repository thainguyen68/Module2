
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ManagePhone extends MethodPhone implements Phone {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public ManagePhone() {
        Contact contact = new Contact("as", "0123456789");
        contacts.add(contact);
        Contact contact1 = new Contact("bc", "022256548");
        contacts.add(contact1);
        Contact contact3 = new Contact("aa", "044256548");
        contacts.add(contact3);
    }


    public ManagePhone(ArrayList<Contact> contacts, Scanner scanner) {
        this.contacts = contacts;
        this.scanner = scanner;
    }

    public ManagePhone(Scanner scanner) {
        this.scanner = scanner;
    }


    @Override
    void displayAllContact() {
        for (Contact p : contacts) {
            System.out.println(p);
        }
    }

    @Override
    void insertPhone() {
        System.out.println("Mời bạn nhập vào đây thông tin vào đây");
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = new Contact(name, phoneNumber);
        contacts.add(newContact);
    }

    @Override
    void removePhone() {
        System.out.println("Mời bạn nhập id muốn xóa vào đây: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        boolean checkDeleteId = false;
        for (int i = 0; i < contacts.size(); i++) {
            if (idDelete == contacts.get(i).getId()) {
                contacts.remove(contacts.get(i));
                checkDeleteId = true;
            }
            if (checkDeleteId) {
                System.out.println("Bạn đã xóa thành công");
            }
        }
        if (!checkDeleteId) {
            System.out.println("Không tìm thấy id...");
        }
    }

    @Override
    void updatePhone() {
        System.out.println("Nhập id liên lạc mà bạn muốn sửa:");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (Contact contact : contacts) {
            if (idEdit == contact.getId()) {
                System.out.println("Nhập tên mới:");
                contact.setName(scanner.nextLine());
                System.out.println("Nhập số điện thoại mới:");
                contact.setPhoneNumber(scanner.nextLine());
                System.out.println("Bạn đã cập nhật thành công!");
            } else {
                System.out.println("Không tồn tại id này...");
            }
        }
    }

    @Override
    public void searchPhone() {
        System.out.println("Mời bạn nhập tên liên lạc cần tìm: ");
        String name = scanner.nextLine();
        boolean checkName = false;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().contains(name)) {
                System.out.println(contacts.get(i));
                checkName = true;
            }
        }
        if (!checkName) {
            System.out.println("Không tìm thấy tên liên lạc...");
        }
    }

    @Override
    public void sort() {
        contacts.sort(new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
