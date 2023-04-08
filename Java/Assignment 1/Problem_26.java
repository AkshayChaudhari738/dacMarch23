/*
 * 26.Write a program to find minimum and maximum number as well as
to add two float numbers using methods of Float
 */

public class Problem_26 {
    public static void main(String[] args) {
        float f1 = 98.25f;
        float f2 = 106.4f;

        float sum = Float.sum(f1, f2);
        System.out.println("Sum is "+sum);

        System.out.println("Min value is " + Float.MIN_VALUE);
        System.out.println("Max value is " + Float.MAX_VALUE);

    }
}
