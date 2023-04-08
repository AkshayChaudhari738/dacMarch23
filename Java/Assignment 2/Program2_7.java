import java.util.Scanner;

class Vehicle {
    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setNumAxles(int numAxles) {
        this.numAxles = numAxles;
    }

    public void setDistance(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    private void calculateToll() {
        if (this.vehicleType.equals("car") || this.vehicleType.equals("van") || this.vehicleType.equals("bus")) {
            this.tollFee = this.numAxles * this.distanceTraveled * 0.25;
        } else if (this.vehicleType.equals("truck")) {
            this.tollFee = this.numAxles * this.distanceTraveled * 0.50;
        }
        this.totalAmountDue = this.tollFee + 2;
    }

    void calculations() {
        this.calculateToll();
    }

    private void generateBill() {
        System.out.println("Vehicle type : " + this.vehicleType);
        System.out.println("NUmber of axles : " + this.numAxles);
        System.out.println("Distance travelled : " + this.distanceTraveled);
        System.out.println("Toll fees($) : " + this.tollFee);
        System.out.println("Total amount due($): " + this.totalAmountDue);
    }

    void getBill() {
        this.generateBill();
    }

}

class Program2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle vh = new Vehicle();
        boolean b = true;
        int choice = -1;
        while (b) {
            printMenu();
            choice = sc.nextInt();
            sc.nextLine(); // consume the newline character left by nextInt()

            switch (choice) {
                case 1:
                    System.out.println("Enter vehicle type: ");
                    vh.setVehicleType(sc.nextLine());
                    System.out.println("Enter number of axles: ");
                    vh.setNumAxles(sc.nextInt());
                    System.out.println("Enter distance travelled: ");
                    vh.setDistance(sc.nextDouble());

                case 2:
                    vh.calculations();
                    break;
                case 3:
                    vh.getBill();
                    break;
                case 4:
                    b = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println("1. Enter vehicle Details: ");

        System.out.println("2. Calculate toll fees");
        System.out.println("3. Generate bill");
        System.out.println("4. Quit");
    }
}