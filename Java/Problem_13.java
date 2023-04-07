/*
 * 13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
 */

public class Problem_13 {
    public static void main(String[] args) {
        short s = 45;

        // Short to string
        String str = Short.toString(s);

        // Short to short instance
        Short s1 = Short.valueOf(s);

        // String to short instance
        String s2 = "75";
        Short s3 = Short.valueOf(s2);

    }
    
}
