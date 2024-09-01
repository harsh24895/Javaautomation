package phonebillexercise;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        PhoneBill bill = new PhoneBill(12453);
        bill.setBasecost(89.99);
        bill.setNumberMinutesUsed(1000);// here we can set any number of argument if we want to set
        bill.printItemizedBill();

    }
}
