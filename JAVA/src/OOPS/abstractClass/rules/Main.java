package OOPS.abstractClass.rules;

public class Main {
    public static void main(String[] args) {
        Super sc;      //We cna get reference of the abstract class.
//        Super sc = new Super();
        /*
        we cannot create the object of abstract class but
        we cna get reference of abstract class
        */

        sub su = new sub();
        su.meth1();
        su.meth2();
    }
}
