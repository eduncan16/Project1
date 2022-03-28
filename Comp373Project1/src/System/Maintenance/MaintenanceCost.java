package System.Maintenance;

public class MaintenanceCost {
    private double materialsCost;
    private double laborCost;

    public MaintenanceCost() {
    }

    public void setLaborCost(double laborCost) {this.laborCost = laborCost;}
    public double getLaborCost() {return laborCost;}

    public void setMaterialsCost(double materialsCost) {this.materialsCost = materialsCost;}
    public double getMaterialsCost() {return materialsCost;}

}