package EXCEPTION_HANDLING;

public class one {
    public static void main(String[] args) {
        try {
            int a,b;
            a=10;
            b=0;
            int c=a/b;
            System.out.println("Addition of "+a+" and "+ b+ " is " + c);
            System.out.println("kunal arya");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}


