package method;

import java.util.Scanner;

public class PhoneBillCalculator {

    static Scanner sc = new Scanner(System.in);
    static double tax = 0.15;
    public static void main(String[] args) {


        double fee = planFee();
        double min = overMinute();

        overFees(min);
        totalTax(min,fee);
    }
    public static double planFee(){
        System.out.println("Enter the plan see");
        double fee = sc.nextDouble();
        return fee;
    }
    public static double overMinute(){
        System.out.println("ENter the overage minute");
        double minute = sc.nextDouble();
        return minute;

    }
    public static double overFees(double Minute){
        if(Minute>=0){
            Minute = Minute * 0.25;
         return Minute;
        }else{
            return 0;
        }
    }
    public static double totalTax(double Minute,double fee){
        double tax = 0.15;
        tax= tax * Minute;
        double total = fee +tax;
        System.out.println("Plan fee: "+fee);
        System.out.println(Minute);

        System.out.println("Tax: "+tax);
        System.out.println("Sub Total: "+total);
        return total;


    }


}
