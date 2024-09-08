package datatype;

public class covertDecimal {
    public static void main(String[] args) {

        //this will convert the decimal with int value with the inValue() method
        double[] numbers = {2.8,5.8,9.2,2.4};

        for(Double number: numbers){
            System.out.println(number.intValue());
        }
    }
}
