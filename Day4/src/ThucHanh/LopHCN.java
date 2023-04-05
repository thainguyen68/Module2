package ThucHanh;

import java.util.Scanner;

public class LopHCN {

    public static class Rectangle {
        double width, height;

        //contructor
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public Rectangle() {}



        //getter-settre

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }


        //toString
        public String display() {
            return "Rectangle{" +
                    "width=" + width +
                    ", height=" + height + "}";
        }
        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhập giá trị chiều dài
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        //nhập giá trị chiều rộng
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();

        //gọi lớp thuộc tính và in ra kết quả
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }

}
