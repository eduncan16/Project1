package System.Maintenance;

public class MaintenanceCost {
    private double materialsCost;
    private double laborCost;

    public MaintenanceCost() {
    }

    public void setlaborCost(double laborCost) {this.laborCost = laborCost;}
    public double getlaborCost() {return laborCost;}

    public void setmaterialsCost(double materialsCost) {this.materialsCost = materialsCost;}
    public double getmaterialsCost() {return materialsCost;}

}