package datatype;

import java.util.Scanner;

public class PasswordCheck {
    private String username;
    private String currentPassword;

    private boolean valid;
    private String erroMessage;

    private static Scanner sc = new Scanner(System.in);

    public PasswordCheck(String username, String currentPassword) {
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public boolean isValid() {
        return valid;
    }

    public String getErroMessage() {
        return erroMessage;
    }

    public Scanner getSc() {
        return sc;
    }


    public static void main(String[] args) {
        var validater = login();
        validater.printPasswordRules();

        do{
            var proposedPassword =validater.getProposedPassword();
            validater.changePassword(proposedPassword);

            if(!validater.isValid()){
                System.out.println(validater.getErroMessage());
            }
        }while (!validater.isValid());
        System.out.println("The proposed password is valid");

    }


    public static PasswordCheck login(){
        System.out.println("Enter your username");
        String username = sc.nextLine();

        System.out.println("Enter your password");
        String password = sc.nextLine();

        return new PasswordCheck(username,password);
    }

    public void printPasswordRules(){
        System.out.println("Your password must meet requirement");
        System.out.println("* at least 8 characters long ");
        System.out.println("* contain an uppercase");
        System.out.println("* contain a lowercase");
        System.out.println("* not contain username");
        System.out.println("* not the same as old password");
        System.out.println();
    }
    public String getProposedPassword(){
        System.out.println("Enter your new Password");
        return sc.nextLine();
    }

    public void changePassword(String newPassword){
        valid = true;
        erroMessage="";

        if(newPassword.length()<8){
            valid=true;
            erroMessage="\n Password must be 8 characters";
        }

        if(newPassword.equals(newPassword.toLowerCase())){
            valid=false;
            erroMessage="\n your password include uppercase";
        }
        if(newPassword.matches("[a-zA-Z0-9 ]*")){
            valid=false;
            erroMessage="\n your password must include a special character (e.g. %,$[:).";
        }
        if(newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            erroMessage = "\n your password cannot contain your username";
        }

        if(newPassword.equals(currentPassword)){
            valid = false;
            erroMessage="\n your password must be different from current password";
        }
    }

}
