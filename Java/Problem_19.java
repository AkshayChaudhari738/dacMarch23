/*
 * 19.Write a program to perform below operations on long type to
get:
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long
 */

public class Problem_19 {
    public static void main(String[] args) {
        System.out.println("bits : "+ Long.SIZE);
        System.out.println("bytes : " + Long.BYTES);
        System.out.println("Min value : " + Long.MIN_VALUE);
        System.out.println("Max value : " + Long.MAX_VALUE);
    }
}
