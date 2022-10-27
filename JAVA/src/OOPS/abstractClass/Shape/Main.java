package OOPS.abstractClass.Shape;

public class Main {
        public static void main(String[] args) {
/*
            circle circle = new circle(7);
            System.out.println(circle.area());
            System.out.println(circle.perimeter());
*/

            rectangle rectangle = new rectangle(10,7);
            System.out.println(rectangle.area());
            System.out.println(rectangle.perimeter());
        }
}
