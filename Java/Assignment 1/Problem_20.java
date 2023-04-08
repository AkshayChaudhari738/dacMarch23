/*
 * 20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.

 */

public class Problem_20 {
    public static void main(String[] args) {
        long l = 4585;

        String str = Long.toString(l);
        System.out.println("String : "+ str);

        Long l2 = Long.valueOf(l);

        String str2 = new String("85654");
        Long l3 = Long.valueOf(str2);
        System.out.println("Long instance = "+l3);

        String str3 = Long.toBinaryString(l3);
        System.out.println("Binary : "+ str3);
        String str4 = Long.toHexString(l3);
        System.out.println("Hexadecimal : "+ str4);
        String str5 = Long.toOctalString(l3);
        System.out.println("Octal : "+ str5);

    }
}
