import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);


        // chuỗi đảo ngược:
        System.out.println("Đảo ngược chuỗi: ");
        System.out.println("Nhập chuỗi vào đây: ");
        String sc = scanner.nextLine();
        for (int i = 0; i < sc.length(); i++) {
            stack.push(sc.charAt(i)+"");
        }
        System.out.println("chuỗi đảo ngược: ");
        for (int i = 0; i < sc.length(); i++) {
            System.out.print(stack.pop());
        }


        System.out.println();
        //chuyển từ hệ thập phân sang hệ nhị phân:
        System.out.println("chuển từ hệ thập phân sang hệ nhị phân");
        Stack <Integer> stack1 = new Stack<>();
        System.out.println("Nhập một số nguyên dương từ bàn phím: ");
        int x = Integer.parseInt(scanner.nextLine());
        while (x>0){
            int soDu = x%2;
            stack1.push(soDu);
            x = x/2;
        }
        System.out.println("Số nhị phân là: ");
        while (!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
    }
}
