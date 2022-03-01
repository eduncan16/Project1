package System.Facility;

import System.Maintenance.MaintenanceOrder;

import java.util.ArrayList;
import java.util.List;

public class FacilityManager {
    private List<Facility> facilities = new ArrayList<Facility>();

    public FacilityManager(){}

    public void addFacility(Facility facility){
        facilities.add(facility);
    }

    public void removeFacility(Facility facility){
        facilities.remove(facility);
    }

    public List<Facility> getFacilities(){
        return facilities;
    }

    public Object getFacility(int position){
        return facilities.get(position);
    }
}
