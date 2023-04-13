package btvn;

import java.util.Scanner;

public class RunMainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Address[] addresses = new Address[3];
        addresses[0] = new Address("Hà Nội");
        addresses[1] = new Address("Đà Nẵng");
        addresses[2] = new Address("Hồ Chí Minh");

        System.out.println("Nhập số lượng người vào đây: ");
        int num = Integer.parseInt(scanner.nextLine());
        Person[] personArr = new Person[num];
        for (int i = 0; i < personArr.length; i++) {
            personArr[i] = createPerson(scanner, addresses);
        }
        int choiceNum;
        do {
            System.out.println("--------Danh Mục------");
            System.out.println("1. Hiển thị danh sách:");
            System.out.println("2. Thêm vào danh sách:");
            System.out.println("3. Xóa khỏi danh sách:");
            System.out.println("4. Sửa thông tin danh sách:");
            System.out.println("5. Tìm kiếm thông tin bằng địa chỉ:");
            System.out.println("6. Sắp xếp thông tin trong danh sách theo tên:");
            System.out.println("Chọn mục theo yêu cầu: ");
            choiceNum = Integer.parseInt(scanner.nextLine());

            switch (choiceNum) {
                case 1:
                    displayPerson(personArr);
                    break;
                case 2:
                    personArr = addPerson(personArr, scanner, addresses);
                    break;
                case 3:
                    personArr = deletePerson(personArr, scanner);
                    break;
                case 4:
                    editPerson(personArr, scanner, addresses);
                    break;
                case 5:
                    searchPerson(personArr, scanner);
                    break;
                case 6:
                    arrangePerson(scanner, personArr);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại:");
            }
        }
        while (true);
    }

    public static Person createPerson(Scanner scanner, Address[] addresses) {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ mà bạn mong muốn");
        for (Address addIn : addresses) {
            System.out.println(addIn);
        }
        return new Person(name, age, newAddress(scanner, addresses));
    }

    public static Address newAddress(Scanner scanner, Address[] addresses) {
        System.out.println("Nhập lựa chọn:");
        int choiceAdd = Integer.parseInt(scanner.nextLine());
        Address newAddress = new Address();
        for (Address address : addresses) {
            if (address.getId() == choiceAdd) {
                newAddress = address;
            }
        }
        return newAddress;
    }

    public static void displayPerson(Person[] people) {
        for (Person person : people) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }

    public static Person[] addPerson(Person[] people, Scanner scanner, Address[] addresses) {
        Person[] newPersonAdd = new Person[people.length + 1];
        System.out.println("Nhập thông tin người bạn muốn thêm");
        System.arraycopy(people, 0, newPersonAdd, 0, people.length);
        newPersonAdd[newPersonAdd.length - 1] = createPerson(scanner, addresses);
        return newPersonAdd;
    }

    public static Person[] deletePerson(Person[] people, Scanner scanner) {
        Person[] newPerson = new Person[people.length - 1];
        System.out.println("Nhập id của người muốn xóa: ");
        int idDelete1 = Integer.parseInt(scanner.nextLine());
        int index = 0;
        for (Person person : people) {
            if (idDelete1 != person.getId()) {
                newPerson[index] = person;
                index++;
            }
        }
        return newPerson;
    }


    public static Person[] editPerson(Person[] people, Scanner scanner, Address[] addresses) {
        System.out.println("Nhập vào id người cần sửa thông tin:");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < people.length; i++) {
            if (idEdit == people[i].getId()) {
                System.out.println("Nhập tên:");
                people[i].setName(scanner.nextLine());
                System.out.println("Nhập tuổi:");
                people[i].setAge(Integer.parseInt(scanner.nextLine()));

                System.out.println("Nhập địa chỉ mà bạn mong muốn");
                for (Address addIn : addresses) {
                    System.out.println(addIn);
                }
                people[i].setAddress(newAddress(scanner, addresses));
            }
        }
        return people;
    }

    public static void searchPerson(Person[] people, Scanner scanner) {
        System.out.println("Nhập địa chỉ cần tìm: ");
        String searchName = scanner.nextLine();
        boolean check = false;
        for (Person person : people) {
            if (searchName.equalsIgnoreCase(person.getAddress().getName())) {
                check = true;
                System.out.println(person);
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy...");
        }


//        for (Person p : people) {
//            if (p.getAddress().getName().equalsIgnoreCase(searchName)) {
//                return p;
//            }
//        }
//        return null;
    }


    public static Person[] arrangePerson(Scanner scanner, Person[] people) {
        Person temp = new Person();
        for (int i = 0; i < people.length; i++) {
            for (int j = i + 1; j < people.length; j++) {
                if (people[i].getName().compareTo(people[j].getName()) > 0) {
                    temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;

                }
            }
        }
        return people;
    }

}
