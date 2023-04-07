/*
 * 11.Accept character from command line and perform below
operations. Here you can use charAt() method to extract
character:
a. Check whether entered character is letter or digit. If it
is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase?
If it is in lowercase then convert it into upper case and
print it well as its code point. If it is in uppercase
Core Java Assignment 1
Designed by Sandeep Kulange
then convert it into lower case and print it well as its
code point.

 */

public class Problem_11 {
    public static void main(String[] args) {
        
        char ch = args[0].charAt(0);

        if(Character.isDigit(ch)){
            System.out.println("Entered character is digit : " + ch);
        }
        else if(Character.isLetter(ch)){
            if(Character.isLowerCase(ch)){
                System.out.println("Character is in lower case");

                ch = Character.toUpperCase(ch);
                System.out.println("After conversion in upper case : "+ ch);
            }
            else{
                System.out.println("Character is in Upper case ");

                ch = Character.toLowerCase(ch);
                System.out.println("After conversion in Lower case : "+ ch);

            }
        }
        else{
            System.out.println("Entered character is neighter digit nor letter ");
        }


    }
}
