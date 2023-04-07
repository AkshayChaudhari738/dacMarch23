/*
 * 32.Write a program to accept and print full name as an argument
from command line.
 */

public class Problem_32 {
    public static void main(String[] args) {
        
        for(int i=0;i<args.length;i++){
            String str = args[i];
            System.out.print(str+" ");
        }
    }
}
