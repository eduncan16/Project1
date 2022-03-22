package System.Use;

import java.util.List;

import System.Facility.Facility;
public interface UseScheduleInterface {
 

    public void acceptUseRequest(UseRequest request);
    public void setFacility(Facility facility);
    public Facility getFacility();
    public List<UseRequest> getUseRequests();
    }

