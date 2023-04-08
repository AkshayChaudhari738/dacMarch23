/*
 * 22. Write a program to find minimum and maximum number as well as
to add two long numbers using methods of Long.

 */

public class Problem_22 {
    public static void main(String[] args) {
        long l1 = 5065;
        long l2 = 8541;

        long min = Math.min(l1, l2);
        long max = Math.max(l1, l2);

        long add = Long.sum(l1,l2);

        System.out.println("Min value : " + min);
        System.out.println("Max value : " + max);
        System.out.println("Sum : "+add);

    }
}
