/*
 * 16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string
 */

public class Problem_16 {
    public static void main(String[] args) {
        int i = 98;

        String str = Integer.toString(i);

        Integer i2 = new Integer(i);
        
        String str2 = new String("55");
        Integer i3 = Integer.parseInt(str2);
        System.out.println("Integer instance : "+ i3);

        String s1 = Integer.toBinaryString(i);
        String s2 = Integer.toOctalString(i);
        String s3 = Integer.toHexString(i);

        System.out.println("Binary : "+ s1);
        System.out.println("Octal : "  + s2);
        System.out.println("Hexadecimal : " + s3);

    }
}
