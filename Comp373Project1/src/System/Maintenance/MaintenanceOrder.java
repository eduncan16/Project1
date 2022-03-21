package System.Maintenance;
import java.util.Date;

public class MaintenanceOrder implements MaintenanceOrderInterface{
    private MaintenanceRequest request;
    private MaintenanceCost cost;
    private Date startDate;
    private Date finishDate;

    public MaintenanceOrder(MaintenanceRequest request){
        this.request = request;
        request.setStatus(true);
    }

    public MaintenanceOrder(){}
    public MaintenanceRequest getOrder() {return request;}

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getStartDate(){
        return startDate;
    }

    public void setFinishDate(Date finishDate){
        this.finishDate = finishDate;
    }

    public Date getFinishDate(){
        return finishDate;
    }

    public void setCost(MaintenanceCost cost) {this.cost = cost;}

    public MaintenanceCost getMaintenanceCost() {return cost;}

}
