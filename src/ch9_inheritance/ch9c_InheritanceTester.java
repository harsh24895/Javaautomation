package ch9_inheritance;

public class ch9c_InheritanceTester {


    public static void main(String[] args) {
        Ch9c_Rectangle rectangle = new Ch9c_Rectangle();
        rectangle.printt();

        ch9c_Square square = new ch9c_Square();
        square.print("square");
    }

    public static void testSquareOverride() {
        Ch9c_Rectangle chrectangle = new Ch9c_Rectangle();
        chrectangle.setLength(4);
        chrectangle.setWidth(9);
        System.out.println(chrectangle.calculatePerimeter());

        ch9c_Square ch9cSquare = new ch9c_Square();
        ch9cSquare.setLength(4);
        ch9cSquare.setWidth(8);
        System.out.println(ch9cSquare.calculatePerimeter());
    }
}
