
/*
 * Exercise 1: Reverse the string "dlroW olleH" then output 
 */

public class ex1_reverse_arr {
    public static void main(String[] args){
        String hello = "dlroW olleH";
        String output = "";

        // loop at hello but from the length to 0
        for (int i = hello.length() - 1; i >= 0; i--){
            output = output + hello.charAt(i);
        }

        System.out.println(output);
    }
}