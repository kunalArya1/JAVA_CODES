package OOPS.abstractClass.rules;

public class sub extends Super {
    /*
     we are getting error because if we are inhereting the
    abstract class then we have to do two thing we have to
    declare subclass is also abstract or we have to
    override all the abstract method of parent class.
    */

    @Override
    public void meth2() {
        System.out.println("Method is overriden ");
    }
    //now we can create the object of subclass
}
