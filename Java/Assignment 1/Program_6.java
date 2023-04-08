import javafx.scene.paint.Stop;
/*
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
*/

class Program_6 {
    public static void main(String[] args) {
        boolean b = true;

        String str = Boolean.toString(b);
        System.out.println(str);

        Boolean b1 = Boolean.valueOf(b);
        System.out.println(b1);

        String str2 = "true";
        boolean b2 = Boolean.parseBoolean(str2);
        System.out.println(b2);

        String str3 = "false";
        boolean b3 = Boolean.valueOf(str3);
        System.out.println(b3);

    }
}