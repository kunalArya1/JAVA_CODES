package OOPS.innerClass;

public class outer {
    int x=10;
    class Inner{
        int y =20;
        public void innerAdd(){
            System.out.println("Addition of " +x +" And "+y+"is "+(x+y));
        }
    }
    public void outerDisplay(){
        Inner i = new Inner();
        i.innerAdd();
        System.out.println(i.y);


    }
}
class InnerExample {
    public static void main(String[] args) {
        outer o =new outer();
        o.outerDisplay();
    }
}
