/*
 * 30.Write a program to find minimum and maximum number as well as
to add two double numbers using methods of Double.
 */

public class Problem_30 {
    public static void main(String[] args) {
        double d1=15.56;
        double d2=24.25;

        double min = Math.min(d1, d2);
        double max = Math.max(d1, d2);

        double ans = Double.sum(d1, d2);

        System.out.println(min);
        System.out.println(max);
        System.out.println(ans);
    }
}
