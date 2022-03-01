package System.Maintenance;

import System.Facility.Facility;

import java.util.ArrayList;
import java.util.List;

public class MaintenaceLog {
    private List<MaintenanceOrder> maintenaceOrders = new ArrayList<MaintenanceOrder>();

    public MaintenaceLog(){}

    public void addOrder(MaintenanceOrder order){
        maintenaceOrders.add(order);
    }

    public List<MaintenanceOrder> getLog(){
        return maintenaceOrders;
    }
}
