package rectangleobject;

public class Rectangle {
    //private no other class will access this length and the width
    // make Getter and setter public to access it outside of this package as enscapsulation says
    //Protected is that other classes within the same package will access the variable
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

        //or we can do this too instead of above
        //setLength(length);
        //setWidth(width);
    }
    public double getLength() {
        return length;
    }
    //here the double length is not the same as we declare is on top
    // it will take top length varaible memory location and store this to double length
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    //here the double width is not the same as we declare is on top
    // it will take to  width varaible memory location and store this to double width
    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatorPerimeter(){
        return (2 * length) + (2 * width);
    }
    public double calArea(){
        return length * width;
    }
}

