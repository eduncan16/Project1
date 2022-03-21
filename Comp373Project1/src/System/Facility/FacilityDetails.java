package System.Facility;

public class FacilityDetails implements FacilityDetailsInterface{
    private String facilityName;
    private int facilityIDNumber;
    private String address;
    private int capacity;
    private FacilityType type;

    public FacilityDetails() {}

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public int getFacilityIDNumber() {
        return facilityIDNumber;
    }

    public void setFacilityIDNumber(int facilityIDNumber) {
        this.facilityIDNumber = facilityIDNumber;
    }

    public int getCapacity() { return capacity; }

    public void setCapacity(int capacity) { this.capacity = capacity; }

    public String getAddress(){ return address; }

    public void setAddress(String address){ this.address = address; }

    public String getType() { return type.getDescription(); }

    public void setType(FacilityType type) { this.type = type; }
}