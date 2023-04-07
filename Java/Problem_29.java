/*
 * 29.Write a program to convert state of Double instance into byte,
short, int, long, float and double.
 */

public class Problem_29 {
    public static void main(String[] args) {
        Double d = new Double(45.60);

        byte b = d.byteValue();
        int i = d.intValue();
        long l = d.longValue();
        float f = d.floatValue();
        double d2 = d.doubleValue();

        System.out.println("Byte :" + b);
        System.out.println("int :" + i);
        System.out.println("long :" + l);
        System.out.println("float :" + f);
        System.out.println("double :" + d2);


    }
}
