/*
 * 17. Write a program to convert state of Integer instance into
byte, short, int, long, float and double
 */

public class Problem_17 {
    public static void main(String[] args) {
        Integer l = new Integer(45);

        byte b = l.byteValue();
        int i = l.intValue();
        short s = l.shortValue();
        long l1 = l.longValue();
        float f = l.floatValue();
        double d = l.doubleValue();

        System.out.println("byte : " +b );
        System.out.println("int : " + i);
        System.out.println("short : " +s );
        System.out.println("long : " +l1 );
        System.out.println("float : " +f );
        System.out.println("double : " + d);



    }
}
