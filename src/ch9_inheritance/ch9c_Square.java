package ch9_inheritance;

public class ch9c_Square extends Ch9c_Rectangle {

    //Here we have override the method by using Override, so that we change the body init
    @Override
    public double calculatePerimeter(){
        return sides * length;// this variable inherited from rectangle class
    }

    public void print(String what){
        System.out.println("This is Square");
    }
}
