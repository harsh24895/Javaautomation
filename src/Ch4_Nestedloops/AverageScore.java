package Ch4_Nestedloops;

import sessionsecond_Ch3.SalesCalculator;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        int Students= 4;
        int tests= 4;

        for(int a=0;a<=Students; a++){
            double total = 0;
            for(int b=0; b<=tests;b++){
                System.out.println("Enter the test score"+ (b+1));
                Scanner sc = new Scanner(System.in);
                  double score = sc.nextDouble();
                  total = total + score;

            }
            double avg = total/tests;
            System.out.println("Average of all test"+avg);
        }
    }
}
