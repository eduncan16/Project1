package System.Facility;

public interface FacilityDetailsInterface {
   
    public String getFacilityName();
    public void setFacilityName(String facilityName);
    public int getFacilityIDNumber();
    public void setFacilityIDNumber(int facilityIDNumber);
    public int getCapacity();
    public void setCapacity(int capacity);
    public String getAddress();
    public void setAddress(String address);
    public String getType();
    public void setType(FacilityType type);
}
