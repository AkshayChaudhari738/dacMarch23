/*
 * 15. Write a program to perform below operations on int type to
get:
a. The number of bits used to represent a integer value
b. The number of bytes used to represent a integer value
c. The minimum value a integer
d. The maximum value a integer
 */

public class Problem_15 {
    public static void main(String[] args) {
        System.out.println("bits : "+ Integer.SIZE);
        System.out.println("bytes : " + Integer.BYTES);
        System.out.println("Min value : " + Integer.MIN_VALUE);
        System.out.println("Max value : " + Integer.MAX_VALUE);
    }
}
