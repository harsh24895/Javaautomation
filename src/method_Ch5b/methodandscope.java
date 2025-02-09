package method_Ch5b;

import java.util.Scanner;

public class methodandscope {
    static int requiredSalary = 25000;
    static int requiredCredit = 700;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        double sal = getSalary();
        int cred = getCredit();
        //check the user qualified
        //just make sure that we have mention different variable names in parameter but will call the exact memory location in backend
        boolean qualified  = isUserQualified(sal,cred);
        //Notify the user if qualified
        notifyUser(qualified);


    }
        public static double getSalary(){
            System.out.println("Enter you salary");
            double salary = in.nextDouble();
            return salary;

        }

        public static int getCredit(){
            System.out.println("Enter your credit");
            int credit = in.nextInt();
            return  credit;
        }

        public static boolean isUserQualified(double salary, int creditscore) {

            if (creditscore >= requiredCredit && salary >= requiredSalary) {
                return true;
            } else {
                return false;
            }
        }
        public static void notifyUser(boolean isQualified){
            if(isQualified){
                System.out.println("you are qualified");
            }else{
                System.out.println("You are not approved");

        }
    }
}
