package sessionsecond_Ch3;

import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args){

        int salary = 5000;
        int bonus= 2000;
        System.out.println("Enter the number of sales you have done");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        if(sales>50){
            salary = salary + bonus;
            System.out.println("You total is"+salary);
        }else{
            System.out.println("please try next time or wrong number");

        }
    }

}
