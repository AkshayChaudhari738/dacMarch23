import java.util.Scanner;

class TelephoneBillCalculator {
    String name;
    long phoneNo;
    int calls;
    double duration;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setCalls(int calls) {
        this.calls = calls;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public double getDuration() {
        return duration;
    }

    public int getCalls() {
        return calls;
    }

    public void calculateBill() {
        int numCalls = this.calls;
        double amount = 0;

        if (numCalls <= 100) {
            amount = 0.5 * numCalls;
        } else {
            int remainingCalls = numCalls - 100;
            amount = 50 + (remainingCalls * 0.25);
        }

        this.duration = Math.ceil(this.duration); // round up to nearest minute

        if (this.duration < 1) {
            this.duration = 1; // minimum duration of 1 minute
        }

        double callCost = this.duration * 0.15; // call rate of 15 cents per minute
        amount += callCost;

        System.out.println("Name of Customer: " + this.name);
        System.out.println("Phone number: " + this.phoneNo);
        System.out.println("Number of calls: " + this.calls);
        System.out.println("Duration of calls: " + this.duration);
        System.out.println("Monthly flat rate: $10");
        System.out.println("Call charges: $" + callCost);
        System.out.println("Total bill amount: $" + (amount + 10));
    }
}

class CustomerData {
    TelephoneBillCalculator tb = new TelephoneBillCalculator();

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        tb.setName(sc.nextLine());
        System.out.println("Phone number: ");
        tb.setPhoneNo(sc.nextLong());
        System.out.println("Number of calls: ");
        tb.setCalls(sc.nextInt());
        System.out.println("Duration of calls (in minutes): ");
        tb.setDuration(sc.nextDouble());
    }

    public void printRecord() {
        tb.calculateBill();
    }
}

public class Program2_5 {
    public static void main(String[] args) {
        CustomerData data = new CustomerData();
        data.acceptRecord();
        data.printRecord();
    }
}