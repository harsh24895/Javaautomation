package rectangleobject_Ch6;

public class HomeCalculator {
    public static void main(String[] args) {
       //look for Rectangle class is attach to it
        //Find the area for the two rooms
        //Rectange 1
        // we created a new object and calling the constructor Rectangle()
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(25);
        rectangle1.setLength(80);

        double areaofroom1 = rectangle1.calArea();

        //rectangle 2
        //we are using other constructor
        Rectangle rectangle2 = new Rectangle(50,90);
        double arearoom2 = rectangle2.calArea();

        double  totalarea  = areaofroom1 + arearoom2;

        System.out.println("Ares of both room: "+totalarea);

    }
}
