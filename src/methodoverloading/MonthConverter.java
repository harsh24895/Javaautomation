package methodoverloading;

public class MonthConverter {
    public static void main(String[] args) {

        //here new don't have to instantiate that class in order to access
        System.out.println(MethodOverloading.getMonth(2));
        System.out.println(MethodOverloading.getMonth("March"));

    }
}
