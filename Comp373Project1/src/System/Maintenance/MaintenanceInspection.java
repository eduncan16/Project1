package System.Maintenance;
import java.util.Date;

public class MaintenanceInspection {
    private Date inspectionDate;
    private String report;
    private boolean pass;

    public MaintenanceInspection(){}

    public void setInspectionDate(Date inspectionDate){
        this.inspectionDate = inspectionDate;
    }

    public Date getInspectionDate(){
        return inspectionDate;
    }

    public void setReport(String report){
        this.report = report;
    }

    public String getReport(){
        return report;
    }

    public void setPass(boolean pass){
        this.pass = pass;
    }

    public boolean getPass(){ return pass; }
}
