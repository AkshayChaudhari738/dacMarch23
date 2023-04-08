/*
 * 27.Write a program to perform below operations on Double type to
get:
a. The number of bits used to represent a double value
b. The number of bytes used to represent a double value
c. The minimum value a double
d. The maximum value a double
 */

public class Problem_27 {
    public static void main(String[] args) {
   
        
        System.out.println("In bits :" +Double.SIZE);
        System.out.println("In bytes :" +Double.BYTES);
        System.out.println("Max value :"+ Double.MAX_VALUE);
        System.out.println("Max value :"+ Double.MIN_VALUE);

    }
}
