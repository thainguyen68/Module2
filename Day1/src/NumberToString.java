import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số bất kỳ từ 0 đến 999");
        int number = scanner.nextInt();
        int hundred = number / 100;
        int dozens = (number % 100) / 10;
        int unit = number % 10;

        String result;

        if (number < 20) {
            //giá g.trị cho các số từ 1 -> 20
            result = m1(number);
        } else if (number < 100) {
            //giá g.trị cho các số có 2 chữ số
            result = m2(dozens) + m1(unit);
        } else {
            //giá g.trị cho các số có 3 chữ số
            result = m1(hundred) + " hundred " + m2(dozens) + m1(unit);
        }
        System.out.println("Kết quả là: " + result);
//        // cách làm cơ bản:
//        if ( number>20){ // đọc các số lớn hơn 20
//            // đọc số hàng trăm:
//            switch (hundred){
//                case 0:
//                    result += "";
//                case 1:
//                    result += "one hundred";
//                    break;
//                case 2:
//                    result += "two hundred ";
//                    break;
//                case 3:
//                    result += "three hundred ";
//                    break;
//                case 4:
//                    result += "four hundred ";
//                    break;
//                case 5:
//                    result += "five hundred ";
//                    break;
//                case 6:
//                    result += "six hundred ";
//                    break;
//                case 7:
//                    result += "seven hundred ";
//                    break;
//                case 8:
//                    result += "eight hundred ";
//                    break;
//                case 9:
//                    result += "nine hundred ";
//                    break;
//            }
//           // đọc số hàng chục :
//           switch (dozens){
//               case 2:
//                   result += "twenty";
//                   break;
//               case 3:
//                    result += "thirty ";
//                    break;
//                case 4:
//                    result += "forty ";
//                    break;
//                case 5:
//                    result += "fifty ";
//                    break;
//                case 6:
//                    result += "sixty ";
//                    break;
//                case 7:
//                    result += "seventy ";
//                    break;
//                case 8:
//                    result += "eighty ";
//                    break;
//                case 9:
//                    result += "ninety ";
//                    break;
//           }
//           // đọc số hàng đơn vị:
//            switch (unit){
//                case 1:
//                    result += "one";
//                    break;
//                case 2:
//                    result += "two";
//                    break;
//                case 3:
//                    result += "three";
//                    break;
//                case 4:
//                    result += "four";
//                    break;
//                case 5:
//                    result += "five";
//                    break;
//                case 6:
//                    result += "six";
//                    break;
//                case 7:
//                    result += "seven";
//                    break;
//                case 8:
//                    result += "eight";
//                    break;
//                case 9:
//                    result += "nine";
//                    break;
//            }
//        } else {
//            // đọc các số nhỏ hơn 20
//            switch (number){
//                case 1:
//                    result += "one";
//                    break;
//                case 2:
//                    result += "two";
//                    break;
//                case 3:
//                    result += "three";
//                    break;
//                case 4:
//                    result += "four";
//                    break;
//                case 5:
//                    result += "five";
//                    break;
//                case 6:
//                    result += "six";
//                    break;
//                case 7:
//                    result += "seven";
//                    break;
//                case 8:
//                    result += "eight";
//                    break;
//                case 9:
//                    result += "nine";
//                    break;
//                case 10:
//                    result += "ten";
//                    break;
//                case 11:
//                    result += "eleven";
//                    break;
//                case 12:
//                    result += "twelve";
//                    break;
//                case 13:
//                    result += "thirteen";
//                    break;
//                case 14:
//                    result += "fourteen";
//                    break;
//                case 15:
//                    result += "fifteen";
//                    break;
//                case 16:
//                    result += "sixteen";
//                    break;
//                case 17:
//                    result += "seventeen";
//                    break;
//                case 18:
//                    result += "eighteen";
//                    break;
//                case 19:
//                    result += "nineteen";
//                    break;
//            }
//        }
//        System.out.println("Kết quả dạng chuỗi là: " + result);
    }



//        cách tôi ưu code
        //đây được gọi là 1 phương thức trong Java
        //phương thức trong Java có cách hiểu tương tự như Hàm trong JS
        //phương thức m2 có giá trị trả về là 1 chuỗi dạng String
        //có giá trị nhận vào là số dạng int
        public static String m2(int value) {
            String result = "";
            switch (value) {
                case 2:
                    result += "twenty ";
                    break;
                case 3:
                    result += "thirty ";
                    break;
                case 4:
                    result += "forty ";
                    break;
                case 5:
                    result += "fifty ";
                    break;
                case 6:
                    result += "sixty ";
                    break;
                case 7:
                    result += "seventy ";
                    break;
                case 8:
                    result += "eighty ";
                    break;
                case 9:
                    result += "ninety ";
                    break;
            }
            return result;
        }

        public static String m1(int value) {
            String result = "";
            switch (value) {
                case 1:
                    result += "one";
                    break;
                case 2:
                    result += "two";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:
                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
                case 10:
                    result += "ten";
                    break;
                case 11:
                    result += "eleven";
                    break;
                case 12:
                    result += "twelve";
                    break;
                case 13:
                    result += "thirteen";
                    break;
                case 14:
                    result += "fourteen";
                    break;
                case 15:
                    result += "fifteen";
                    break;
                case 16:
                    result += "sixteen";
                    break;
                case 17:
                    result += "seventeen";
                    break;
                case 18:
                    result += "eighteen";
                    break;
                case 19:
                    result += "nineteen";
                    break;
            }
            return result;
        }
    }

