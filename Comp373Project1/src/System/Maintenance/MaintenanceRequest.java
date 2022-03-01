package System.Maintenance;

import java.util.Date;

public class MaintenanceRequest {
    private Date requestDate;
    private String description;
    //Maintenance request accepted or not
    private boolean status;
    //if has inspection to refer to
    private MaintenanceInspection inspection;

    public MaintenanceRequest(){}

    public MaintenanceRequest(MaintenanceInspection inspection){ this.inspection = inspection; }

    public MaintenanceInspection getInspection(){ return inspection; }

    public void setRequestDate(Date requestDate){
        this.requestDate = requestDate;
    }

    public Date getRequestDate(){
        return requestDate;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }

}
