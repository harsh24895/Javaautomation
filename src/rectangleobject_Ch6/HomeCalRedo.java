package rectangleobject_Ch6;

import java.util.Scanner;

public class HomeCalRedo {
    public static void main(String[] args) {
        //Ch_6c
        //Loook for Rectangle class here are redoing this practice on rectangle class
        //here we are calling the method without static declare as static method does not required any instance
        // So if we want to call getRoom in main method without declaring the static, we need to intentiaite the Class which we are in currently
        // here we declare new HomeCalRedo as we don't want to create a new instance of class but we still want to access from the class
        HomeCalRedo calculator = new HomeCalRedo(); //also in java the HomeCalRedo is a constructor define implictly
        Rectangle rectkitchen = calculator.getRoom();
        Rectangle bath = calculator.getRoom();

        double area = calculator.calculatorTotalArea(rectkitchen,bath);

        System.out.println("Total area is: "+area);
    }

    public Rectangle getRoom(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your room:");
        double length = sc.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = sc.nextDouble();
        // here we are returning the variable which two parameters
        return new Rectangle(length,width);
    }

    public double calculatorTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calArea()+ rectangle2.calArea();
    }


}
