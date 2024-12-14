package datatype;
//CHapter 8b: String example 2
public class StringBuildertext {

    public static void main(String[] args) {
        //countWords("This is a test file");
        //reverseString("Hello");
        addSpaces("This is aTextOnly");
    }

    private static void addSpaces(String thisIsATextOnly) {

        var modifiy = new StringBuilder(thisIsATextOnly);

        for(int i=0;i<modifiy.length();i++){
            if(i!=0 && Character.isUpperCase(modifiy.charAt(i))){
                modifiy.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiy);
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
