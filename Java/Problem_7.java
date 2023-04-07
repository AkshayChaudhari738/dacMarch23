/*
 * 7.Write a program to perform below operations on byte type to
get:
a. The number of bits used to represent a byte value
b. The number of bytes used to represent a byte value
c. The minimum value a byte
d. The maximum value a byte
 */

public class Problem_7 {
    public static void main(String[] args) {
        
        System.out.println("bits : "+ Byte.SIZE);
        System.out.println("bytes : " + Byte.BYTES);
        System.out.println("Min value : " + Byte.MIN_VALUE);
        System.out.println("Max value : " + Byte.MAX_VALUE);
    }
}
