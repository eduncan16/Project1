package System.Maintenance;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceLog {
    private List<MaintenanceOrder> maintenaceOrders = new ArrayList<MaintenanceOrder>();

    public MaintenanceLog(){}

    public void addOrder(MaintenanceOrder order){
        maintenaceOrders.add(order);
    }

    public List<MaintenanceOrder> getLog(){
        return maintenaceOrders;
    }
}
