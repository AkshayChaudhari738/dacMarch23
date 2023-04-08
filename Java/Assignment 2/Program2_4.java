import java.util.Scanner;;

class ElectricityBill {
    String customerName;
    double unitsConsumed;
    double billAmount;

    ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void calculateBillAmount() {
        double bill = 0;
        if (this.unitsConsumed <= 100 ) {
            bill = 5 * this.unitsConsumed;
        } 
        if (this.unitsConsumed <= 200) {
            double temp = this.unitsConsumed - 100;
            bill = 100*5 + (temp * 7);
        }
        else if (this.unitsConsumed > 200) {
            double temp = this.unitsConsumed - 200;
            bill = 100*5 + 100*7 + (temp * 10);
        }
        System.out.println("Customer name : "+ this.customerName);
        System.out.println("Units consumed : "+ this.unitsConsumed);
        System.out.println("Calculated bill amount is : "+ bill);
    }
}

public class Program2_4 {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill("Akshay Chaudhari", 177);
        eb.calculateBillAmount();
    }
}
