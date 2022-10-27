package OOPS.abstractClass.Shape;

abstract public class Shape {
    abstract public double area();
    abstract public double perimeter();
}
class circle extends Shape{
    int radius;
    public circle(int radius){
        this.radius=radius;
    }
    @Override
    public double area() {
        return (4*Math.PI*radius*radius);
    }

    @Override
    public double perimeter() {
        return (Math.PI*radius*radius);
    }
}

class rectangle extends Shape{
    int length;
    int breadth;
    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public double area() {
        return (length*breadth);
    }

    @Override
    public double perimeter() {
        return (2*(length+breadth));
    }

}
