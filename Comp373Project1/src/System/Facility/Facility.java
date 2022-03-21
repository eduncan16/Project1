package System.Facility;

public class Facility implements FacilityInterface{
    private int facilityID;
    private FacilityDetails details;

    public Facility() {

    }

    public FacilityDetails getFacilityDetail() {
        return details;
    }

    public void setFacilityDetail(FacilityDetails details) {
        this.details = details;
    }

    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    public int getFacilityID() {
        return facilityID;
    }
}
