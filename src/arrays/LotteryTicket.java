package arrays;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 8; // as we have declare in capital letters that means its a constant value
    private static final int MAX_TICKET_NUMBER = 88;
    public static void main(String[] args) {
        int[] ticket = generateNumber();
        printTicket(ticket);

    }

    public static int[] generateNumber(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int a=0;a<LENGTH;a++ ){
            ticket[a] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }

        return ticket;
    }

    //Here are printing out the tickets and passing the ticket parameters to call in main method
    public static void printTicket(int ticket[]){
        for(int y = 0;y<LENGTH;y++){
            System.out.print(y+":");
            System.out.print(ticket[y] + "  ");
        }
    }
}
