package btvn;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainTestMap {
    static Map<String, String> map = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static Set<String> keys = map.keySet();


    public static void main(String[] args) {
        map.put("hi", "chào");
        map.put("bye", "tạm biệt");
        map.put("love", "yêu");
        map.put("hate", "ghét");

        int choice;
        do {
            System.out.println("----------------menu------------------");
            System.out.println("1. hiển thị");
            System.out.println("2. thêm từ mới");
            System.out.println("3. tìm từ");
            System.out.println("4. sửa từ");
            System.out.println("Nhập lựa chon bạn muốn: ");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    displayWord();
                    break;
                case 2:
                    addWord();
                    break;
                case 3:
                    searchWord();
                    break;
                case 4:
                    updateWord();
                    break;
                case 0:
                    System.exit(0);
            }

        }while (true);
    }

    public static void displayWord(){
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }
    }
    public static void addWord() {
        System.out.println("thêm từ tiếng anh:");
        String keyEng = scanner.nextLine();
        System.out.println("thêm từ tiếng việt:");
        String keyVn = scanner.nextLine();
        map.put(keyEng, keyVn);
    }

    public static void searchWord() {
        System.out.println("Nhập từ muốn tra:  ");
        String searchName = scanner.nextLine();
        for (String key : keys) {
            if (searchName.equalsIgnoreCase(key)) {
                System.out.println("Nghĩa của từ " + key + " là " + map.get(key));
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

    public static void updateWord() {
        System.out.println("Nhập từ tiếng anh mà bạn muốn sửa: ");
        String nameEdit = scanner.nextLine();

        for (String key : keys) {
            if (nameEdit.equalsIgnoreCase(key)) {
                System.out.println("Nhập tên mới");
                String nameUp = scanner.nextLine();
                map.put(key, nameUp);
                return;
            }
        }
        System.out.println("không tồn tại");
    }
}
