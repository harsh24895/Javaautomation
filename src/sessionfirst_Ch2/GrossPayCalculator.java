package sessionfirst_Ch2;

import java.util.Scanner;

public class GrossPayCalculator {


    public static void main(String arg[]){

        // Take the input from the user
        System.out.println("Enter the number of hours:");
        Scanner sc= new Scanner(System.in);
        int hour = sc.nextInt();

        //Get the pay rate
        System.out.println("Enter the pay rate:");
        Scanner sct = new Scanner(System.in);
        double rate = sct.nextDouble();


         //multiply the hour and rate
        double total = hour * rate;
        //Display result
        System.out.println(total);



        System.out.println("Enter the season");
        Scanner seas= new Scanner(System.in);
        int seass = seas.nextInt();

        //Get the pay rate
        System.out.println("Enter adjective:");
        Scanner year = new Scanner(System.in);
        int yt = year.nextInt();

        System.out.println("Enter the number of coffee for whole day");
        Scanner wh = new Scanner(System.in);
        int whole = wh.nextInt();

        System.out.println("On a"+seass+" "+yt+"day, i drink a minimum of"+whole+"cupe of coffee");


    }
}
