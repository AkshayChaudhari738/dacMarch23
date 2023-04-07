/*
 * 9.Write a program to convert state of Byte instance into byte,
short, int. long, float and double.
 */

public class Problem_9 {
    public static void main(String[] args) {
        Byte b = new Byte("14");

        short s = b.shortValue();
        int i = b.intValue();
        long l = b.longValue();
        float f = b.floatValue();
        double d = b.doubleValue();
        byte b1 = b.byteValue();

        System.out.println("byte : " +b1 );
        System.out.println("int : " + i);
        System.out.println("short : " +s );
        System.out.println("long : " +l );
        System.out.println("float : " +f );
        System.out.println("double : " + d);

    }
}
