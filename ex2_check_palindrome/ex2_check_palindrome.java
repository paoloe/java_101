package ex2_check_palindrome;

/*
 * Exercise 2: For a given string check if is also a palindrome
 */
public class ex2_check_palindrome {
    public static void main(String[] args){
        String input = "Racecar";
        String reversed = "";

        //reverse the string
        for (int i = input.length() - 1; i >= 0; i--){
            reversed = reversed + input.charAt(i);
        }

        //check if the input = reversed value
        if (reversed.equalsIgnoreCase(input)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}