public class Demo {
    public static void main(String[] args) {
        String message1 = "Hello world";
        //‘’,\t,\f,\r,\n
        String message2 = " 123 \t";
        //nối chuỗi:
//        String message3 = message1+message2;
        String message3 = message1.concat(message2);
        //toLowerCase() & toUpperCase()

        System.out.println("Hiển thị thông tin message: "+message3);
        System.out.println("Loại bỏ khoảng trắng: "+message3.trim());
        System.out.println("Hiển thị độ dài: "+ message3.length());
        System.out.println("Ký tự ở vị trị là: "+message3.charAt(12));
        System.out.println("toIpperCase(): "+message3.toLowerCase());
        System.out.println("toIpperCase(): "+message3.toUpperCase());
        System.out.println(message1.lastIndexOf("l",2));

//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append();
//        stringBuffer
//        stringBuffer.delete(7,10);
//        stringBuffer.replace(0,);
//        System.out.println(stringBuffer);

        System.out.println("StringBuilder");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hi CẬU ");
        stringBuilder.insert(7,"123");
        stringBuilder.delete(0,1);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
