/*
 * 25.Write a program to convert state of Float instance into byte,
short, int, long, float and double.
 */

public class Problem_25 {
    public static void main(String[] args) {
        Float f = new Float(55.25f);

        byte b = f.byteValue();
        short s = f.shortValue();
        int i = f.intValue();
        long l = f.longValue();
        float f1 = f.floatValue();

        System.out.println("byte :"+b);
        System.out.println("short "+s);
        System.out.println("int "+i);
        System.out.println("long "+l);
        System.out.println("float "+f1);
    }
}
