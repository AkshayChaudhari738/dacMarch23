import java.util.Scanner;

class bmiCalculator{
    private double height;
    private double weight;

    bmiCalculator(){
        this(0.0,0.0);
    }
    bmiCalculator(double height,double weight){
        this.height = height;
        this.weight = weight;
    }


    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getHeight(){
        return this.height/100;
    }
    public double getWeight(){
        return this.weight;
    }

    
    public double calculateBMI(){
        double bmi = getWeight() / (getHeight() * getHeight());
        return bmi;
    }
}


public class Program2_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        bmiCalculator calc = new bmiCalculator();
        System.out.println("Enter height : ");
        calc.setHeight(sc.nextDouble());
        System.out.println("Enter Weight : ");
        calc.setWeight(sc.nextDouble());

        double BMI = calc.calculateBMI();
        System.out.println("BMI : "+ BMI);
    }
}
