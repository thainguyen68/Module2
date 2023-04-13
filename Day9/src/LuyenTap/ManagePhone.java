package LuyenTap;

import java.util.Scanner;

public class ManagePhone extends AbsPhone {

    static Scanner scanner = new Scanner(System.in);

    Contact[] contacts;

    public ManagePhone() {
        contacts = new Contact[10];
        contacts[0] = new Contact("a", "123");
        contacts[1] = new Contact("b", "234");
    }

    public static void create() {

    }


    @Override
    public void insertPhone(Contact contact) {
        Contact[] contact1 = new Contact[contacts.length + 1];
        Contact newContact = new Contact();
        System.arraycopy(contacts, 0, contact1, 0, contacts.length);
        contact1[contact1.length - 1] = newContact;
        newContact.setNameCont(scanner.nextLine());
        newContact.setPhoneNumber(scanner.nextLine());
        contacts = contact1;
    }

    @Override
    public void removePhone(String name) {

    }

    @Override
    public void updatePhone(String name, String newPhone) {

    }

    @Override
    public void display() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
