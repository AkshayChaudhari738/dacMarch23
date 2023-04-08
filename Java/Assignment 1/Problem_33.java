/*
 Pass integer, float and double value from command line. Parse
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case.
 */

public class Problem_33 {
    public static void main(String[] args) {
        int choice = 1;
        int i=Integer.parseInt(args[0]);
        float f = Float.parseFloat(args[1]);
        double d = Double.parseDouble(args[2]);
        double ans = 0;

        switch(choice){
            case 1:
            ans = i+f+d;
            break;

            case 2:
            ans = d-f-i;
            break;

            case 3:
            ans = i*f*d;
            break;

            case 4:
            ans = d/f/i;
            break;
        }
        System.out.println(ans);
    }
}
