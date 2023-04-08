/*
 * 14.Write a program to convert state of Short instance into byte,
short, int, long, float and double
 */

public class Problem_14 {
    public static void main(String[] args) {
        short s = Short.valueOf((short)44);

        byte b = (byte)s;
        int i = s;
        long l = s;
        float f = s;
        double d = s;

        System.out.println("byte : " +b );
        System.out.println("int : " + i);
        System.out.println("short : " +s );
        System.out.println("long : " +l );
        System.out.println("float : " +f );
        System.out.println("double : " + d);


    }
}
