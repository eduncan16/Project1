package System.Maintenance;
import java.util.Date;

public interface MaintenanceOrderInterface {


    public MaintenanceRequest getOrder();
    public void setStartDate(Date startDate);
    public Date getStartDate();
    public void setFinishDate(Date finishDate);
    public Date getFinishDate();
    public void setCost(MaintenanceCost cost);
    public MaintenanceCost getMaintenanceCost();
}
