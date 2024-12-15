package datatype_ch8;

//CHapter 8b: String
public class TextProcessor {

    public static void main(String[] args) {
        countWords("This is a test file");
    }

    /**
     * Splits a string into a array  by tokenizing it
     * count word and print them
     * @param testfile Full string
     */
    private static void countWords(String testfile) {

        var words = testfile.split(" ");
        int numberofWords = words.length;

        String message = String.format("your text contains %d words:",numberofWords);
        System.out.println(message);

        for(int i=0; i<numberofWords;i++){
            System.out.println(words[i]);
        }

    }

}
