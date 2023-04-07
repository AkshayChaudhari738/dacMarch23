/*
 * 18. Write a program to find minimum and maximum number as well as
to add two integer numbers using methods of Integer.
 */

public class Problem_18 {
    public static void main(String[] args) {
        int a = 45;
        int b = 22;

        int min = Math.min(a,b);
        int max = Math.max(a, b);

        int add = Integer.sum(a,b);
        System.out.println("Min : "+ min);
        System.out.println("Max : " + max);
        System.out.println("Sum : "+ add);
        


    }
}
