package OOPS.classAndObject;

public class Rectangle {
    private int length;
    private int breadth;

    //Parametrize Constructor
    public Rectangle(){
        length=1;
        breadth=1;
    }
    //Non-paramertrize Constructor
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    //Getter method for length
    public int getLength() {
        return length;
    }
    //Setter method for length
    public void setLength(int length) {
        this.length = length;
    }
    //Getter method for breadth
    public int getBreadth() {
        return breadth;
    }
    //Setter method for breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area(){
        return (length*breadth);
    }
    public int perimeter(){
        return (2*(length+breadth));
    }
}
