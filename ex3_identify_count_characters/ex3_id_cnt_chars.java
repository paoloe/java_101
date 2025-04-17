package ex3_identify_count_characters;

import java.lang.Character;

/*
 * Exercise 3: For a given string, count the number of 
 * letters, spaces, numbers and other (special characters)
 * git test
 */
public class ex3_id_cnt_chars{
    /*
     * declare counters and the characters to compare against
     * 
     * loop through the string
     *  could have a case statement checking if it is any of the above
     *  ++ counter
     * 
     * print the counters
     */
    public static void main(String[] args) {
        String test = "This is a test sentence! 0011";
        int letter = 0, 
            space = 0, 
            number = 0, 
            symbol = 0;

        for(int x = 0; x <= test.length() - 1; x++){
            boolean y = Character.isDigit(test.charAt(x));
            char j = test.charAt(x);             

            if (Character.isAlphabetic(j)) {
                letter++;
            } else if (Character.isDigit(j)){
                number++;
            } else if (Character.isWhitespace(j)){
                space++;
            } else {
                symbol++;
            }
        }

        System.out.println("letters = " + letter + " number = " + number + " spaces = " + space + " symbols = " + symbol  );
    }
    
}