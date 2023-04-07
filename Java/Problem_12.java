/*
 * 12.Write a program to perform below operations on short type to
get:
a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short

 */

public class Problem_12 {
    public static void main(String[] args) {
        
        System.out.println("bits : "+ Short.SIZE);
        System.out.println("bytes : " + Short.BYTES);
        System.out.println("Min value : " + Short.MIN_VALUE);
        System.out.println("Max value : " + Short.MAX_VALUE);
    }
}
