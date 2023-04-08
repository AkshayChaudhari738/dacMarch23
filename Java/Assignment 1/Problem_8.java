/*
 * 8.Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance
 */

import javax.xml.transform.Source;

public class Problem_8 {
    public static void main(String[] args) {
        byte b = 41;
        // Byte into string
        String str = Byte.toString(b);
        System.out.println("String : "+ str);
        System.out.println(str);

        // byte into byte instance
        Byte b1 = new Byte(b);
        System.out.println(b1);
        
        // String into byte
        String str2 = "7";
        Byte b2 = Byte.parseByte(str2);
        System.out.println(b2);

    }
}
