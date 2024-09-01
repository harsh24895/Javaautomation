package phonebillexercise;

public class PhoneBill {
    int id;
    double basecost;
    double allocatedMinutes;
    double numberMinutesUsed;

    public PhoneBill(){
        int id = 0;
        basecost = 69.99;
        allocatedMinutes = 900;
        numberMinutesUsed = 900;
    }
    public PhoneBill(int id){
        this.id = id;
        basecost = 69.99;
        allocatedMinutes = 900;
        numberMinutesUsed = 900;
    }
    public PhoneBill(int id, double basecost, double allocatedMinutes, double numberMinutesUsed){
        this.id = id;
        this.basecost =basecost;
        this.allocatedMinutes = allocatedMinutes;
        this.numberMinutesUsed = numberMinutesUsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBasecost() {
        return basecost;
    }

    public void setBasecost(double basecost) {
        this.basecost = basecost;
    }

    public double getAllocatedMinutes() {
        return allocatedMinutes;
    }

    public void setAllocatedMinutes(double allocatedMinutes) {
        this.allocatedMinutes = allocatedMinutes;
    }

    public double getNumberMinutesUsed() {
        return numberMinutesUsed;
    }

    public void setNumberMinutesUsed(double numberMinutesUsed) {
        this.numberMinutesUsed = numberMinutesUsed;
    }

    public double overageBill(){
        if(numberMinutesUsed <= allocatedMinutes){
            return 0;
        }
        double overRate = 0.25;
        double overageMinute = numberMinutesUsed - allocatedMinutes;
        return overageMinute * overRate;

    }
    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (basecost + overageBill());
    }

    public double calculateTotal(){
        return basecost + calculateTax()+ overageBill();
    }

    public void printItemizedBill(){
        System.out.println("ID"+id);
        System.out.println("Base rate"+basecost);
        System.out.println("Overage fee $"+String.format("%.2f",overageBill()));
        System.out.println("Tax $"+String.format("%.2f",calculateTax()));
        System.out.println("Total $"+String.format("%.2f",calculateTotal()));

    }
}
