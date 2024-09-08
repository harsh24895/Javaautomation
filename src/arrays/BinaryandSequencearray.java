package arrays;

import java.util.Arrays;
import java.util.Random;

public class BinaryandSequencearray {
    private static final int LENGTH = 8; // as we have declare in capital letters that means its a constant value
    private static final int MAX_TICKET_NUMBER = 88;
    public static void main(String[] args) {
        int[] ticket = generateNumber();
        Arrays.sort(ticket); // this sort the array in ascending order
        printTicket(ticket);

    }

    public static int[] generateNumber(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int a=0;a<LENGTH;a++){
            int randomNumber;
            ///Generate a random number then search and make sure it doesn't already exist in the array
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(ticket, randomNumber)); // here we search for duplicate numbers if there duplicate in the ticket number

            ticket[a] = randomNumber;
        }

        return ticket;
    }

    /**
     * This does a sequential search on the array to find a value
     * @param array :this is a array to search through
     * @param numberToSearchFor : this is the value to search for
     * @return
     */
    public static boolean search(int[] array , int numberToSearchFor){

        /*This is called an enchanced loop. It will iterates through "array" each time
         assign the currrent element to "value".  ***************************/
        for(int value:array){ //this loops only works if we have predefine values as we can up top
            if(value==numberToSearchFor){
                return true;
            }
        }
        // if we reached this point, then entire array was searched and then value not found
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){
        //Array must be sorted in binary search
        Arrays.sort(array);

        int index = Arrays.binarySearch(array,numberToSearchFor);
        if(index >=0){
            return true;
        }
        else return false;


    }

    //Here are printing out the tickets and passing the ticket parameters to call in main method
    public static void printTicket(int ticket[]){
        for(int y = 0;y<LENGTH;y++){
            System.out.print(y+":");
            System.out.print(ticket[y] + "  ");
        }
    }
}
