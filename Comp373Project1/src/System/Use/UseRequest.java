package System.Use;

import java.util.Date;

public class UseRequest {
    private Date startDate;
    private Date endDate;
    private Date requestDate;
    private String description;
    private boolean useStatus;

    public UseRequest(){
        useStatus = false;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getStartDate(){ return startDate; }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    public Date getEndDate(){
        return endDate;
    }

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

    public void setUseStatus(boolean useStatus){
        this.useStatus = useStatus;
    }

    public boolean getUseStatus(){
        return useStatus;
    }

}
