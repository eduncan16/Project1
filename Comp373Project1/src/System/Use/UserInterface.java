package System.Use;

import System.Facility.Facility;

public interface  UserInterface {
    
        public void setName(String name);
        public String getName();
        public void setUseSchedule(UseSchedule schedule);
        public UseSchedule getUseSchedule();
        public void setUserType(UserType type);
        public UserType getUserType();
        public void setFacility(Facility facility);
        public Facility getFacility();
    
    
}
