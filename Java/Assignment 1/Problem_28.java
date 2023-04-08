public class Problem_28 {
    public static void main(String args[])
    {
        //28.Write a program to convert:
        //a. double value into String
        double num1=67.4d;
        String str=String.valueOf(num1);
        System.out.println("Double value into String: "+str);

        //b. double value into Double instance.
        double num2=54.3d;
        Double d1=Double.valueOf(num2);
        System.out.println("double value into Double instance: "+d1);

        //c. String instance into Double instance.
        String str1=new String("dost");
        Double d2=Double.parseDouble(str1);
        System.out.println(d2);

        //d. double value into binary, octal and hexadecimal
        double d3=68.3d;
        System.out.println(Double.toHexString(d3));
        
        //string(Note: Here you can use doubleToLongBits() method
        //along with methods of Long class).

    }

}
