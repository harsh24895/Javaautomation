package methodoverloading;

public class MethodOverloading {

    //Method overloading
    // Here we are using the same method name but different parameters
    public static String getMonth(int month){
        switch(month){
            case 1:return "Jan";
            case 2: return "Feb";
            case 3: return "March";
            default: return "invalid month. please enter again";
        }


    }
    public static int getMonth(String month){

        switch (month){
            case "Jan":return 1;
            case "Feb":return 2;
            case "March":return 3;
            default:return 0;
        }

    }
}
