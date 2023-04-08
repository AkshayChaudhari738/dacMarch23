/*
 * 21.Write a program to convert state of Long instance into byte,
short, int, long, float and double.
 */

class Problem_21{
    public static void main(String[] args) {
        Long l = Long.valueOf(9654);

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