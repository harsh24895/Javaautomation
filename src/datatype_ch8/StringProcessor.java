package datatype_ch8;


//CHapter 8b: String Example practice
public class StringProcessor {

    public static void main(String[] args) {
        countWords("This is a test file");
        reverseString("Hello");
    }

    /**
     * Splits a string into a array  by tokenizing it
     * count word and print them
     * @param testFile Full string
     */
    private static void countWords(String testFile) {
    }

    /**
     * print a string in revserse
     *
     * @param hello Full string
     */
    private static void reverseString(String hello) {

        for(int i=hello.length()-1;i>=0;i--){ //here we are setting -1 because the loop starts at 0 and we need to reverse it so
            System.out.print(hello.charAt(i));

        }

    }

}
