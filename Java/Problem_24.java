/*
 * 24.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.
 */

public class Problem_24 {
    public static void main(String[] args) {
        float f1 = 58.4f;
        // float value into String
        String str = Float.toString(f1);
        System.out.println(str);

        // float value into Float instance.
        Float f2 = new Float(f1);
        System.out.println(f2);

        // String instance into Float instance
        String str2 = new String("85.25");
        float f3 = Float.parseFloat(str2);
        System.out.println(f3);

        // float value into hexadecimal string
        String str3 = Float.toHexString(f1);
        System.out.println(str3);


    }
}
