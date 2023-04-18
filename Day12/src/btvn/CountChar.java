package btvn;

import java.util.*;

public class CountChar {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng các các số muốn nhập vào đây: ");
        int num = Integer.parseInt(scanner.nextLine());
        int inUp = 1;
        for (int i = 0; i < num; i++) {
            System.out.println("nhập số thứ " + inUp + " vào đây: ");
            arrayList.add(Integer.parseInt(scanner.nextLine()));
            inUp++;
        }
        System.out.println(arrayList);

        Map<Integer, Integer> countNum = new TreeMap<>();
        for (int j : arrayList) {
            if (countNum.containsKey(j)) {
                countNum.put(j, countNum.get(j) + 1);
            } else {
                countNum.put(j, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : countNum.entrySet()) {
            System.out.println("Số lần xuất hiện của số " + entry.getKey() + " là " + entry.getValue());
        }
    }
}
