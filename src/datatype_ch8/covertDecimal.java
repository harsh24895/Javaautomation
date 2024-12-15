package datatype_ch8;

public class covertDecimal {
    public static void main(String[] args) {

        //this will convert the decimal with int value with the inValue() method
        // intValue comes from the Wrapper class of Integer
        double[] numbers = {2.8,5.8,9.2,2.4};

        for(Double number: numbers){
            System.out.println(number.intValue());
        }
    }
}
