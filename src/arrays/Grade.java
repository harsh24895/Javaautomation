package arrays;

import java.util.Scanner;

public class Grade {

    //Tricks in Array
    //Creating a program that allow user to enter any number of grade and provides them with average score, as well as highest and lower score
    private static int grades[];
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("How many grade would you like to enter");
        grades = new int[scanner.nextInt()]; // Here we are taking input for the array

        getGrades();

        System.out.println("Average: "+ String.format("%.2f",calculateAverage())); // for "%.2f" f means float and here will shows two decimal places
        System.out.println("Highest: "+getHighest());
        System.out.println("Lowest: "+getLowest());

    }
    public static void getGrades(){
        for(int b=0;b<grades.length;b++){
            System.out.println("Enter the grade "+(b+1));
            grades[b] = scanner.nextInt();// it will store the grade here
        }
    }
    
    public static int calculateSum(){
        int sum =0;
        for(int grade : grades){
            sum = sum + grade;
        }
        return  sum;
    }
    
    public static  double calculateAverage(){
        return calculateSum()/grades.length;
    }
    
    public static int getHighest(){
        int highest = grades[0]; //here we are assigning the highest value to first position
        for(int grade:grades){
            if(grade>highest){
                highest = grade;
            }
            
        }
        return highest;
    }
    
    public static int getLowest(){
        int lowest = grades[0]; //here we are assigning the lowest value to first position
        for(int grade:grades){
            if(grade<lowest){
                lowest = grade;
            }
        }
        return lowest;

    }
}
