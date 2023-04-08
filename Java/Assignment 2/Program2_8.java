import java.util.*;

public class Program2_8 {
    double num1;
    double num2;
    double result;
    String operator;
    static Scanner scanner = new Scanner(System.in);

    public void getNumbers(){
        System.out.print("Enter first numerator: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter first denominator : ");
        double den1 = scanner.nextDouble();
        this.num1 = num1 / den1;
        System.out.print("Enter second numerator: ");
        num2 = scanner.nextDouble();
        System.out.print("Enter second denominator: ");
        double den2 = scanner.nextDouble();
        this.num2 = num2 / den2;
    }

    public void performCalculation(){
        System.out.print("Enter arithmetic operation (+, -, *, /): ");
        operator = scanner.next();
        if(operator.equals("+")){
            result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if(operator.equals("-")){
            result = num1 - num2;
            System.out.println("Result: " + result);
        }
        else if(operator.equals("*")){
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
        else if(operator.equals("/")){
            result = num1 / num2;
            System.out.println("Result: " + result);
        }
        else{
            System.out.println("Invalid operator");
            return;
        }

    }

    public static void main(String[] args) {
        Program2_8 program = new Program2_8();
        program.getNumbers();
        program.performCalculation();
    }
}