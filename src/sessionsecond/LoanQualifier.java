package sessionsecond;

import java.util.Scanner;

//Nested loop concept
public class LoanQualifier {
    public static void main(String[] args){

        int requiredSalary= 30000;
        int years = 2;

        System.out.println("Enter the salary");
        Scanner sc= new Scanner(System.in);
        double salary = sc.nextDouble();
        System.out.println("Enter the years");
        Scanner st = new Scanner(System.in);
        double year = st.nextDouble();

        if(salary>=requiredSalary){
            if(year>=years) {
                System.out.println("you are eligible");
            }else{
                System.out.println(" you must have to work above "+ years + " to get eligible");
            }
        }else{
            System.out.println("you are not eligible as per the policy and " + requiredSalary + "must match");
        }
    }
}
