package arrays;

import java.util.Scanner;

public class DayofWeek {

    public static void main(String[] args) {
        String[] week = {"Monday","Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days of a Week");
        int index = sc.nextInt();

        System.out.println("The day is:"+ week[index - 1]);
        //it throws the error


    }
}
