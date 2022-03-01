package System.Use;

import System.Facility.Facility;
import System.Maintenance.MaintenanceOrder;

import java.util.ArrayList;
import java.util.List;

public class UseSchedule {
    private Facility facility;
    private List<UseRequest> requests = new ArrayList<UseRequest>();

    public UseSchedule(Facility facility){
        this.facility = facility;
    }

    public UseSchedule(){}

    public void acceptUseRequest(UseRequest request){
        requests.add(request);
        request.setUseStatus(true);
    }

    public void setFacility(Facility facility){this.facility=facility;}

    public Facility getFacility(){return facility;}

    public List<UseRequest> getUseRequests(){
        return requests;
    }

}
