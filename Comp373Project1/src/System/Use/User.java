package System.Use;

import System.Facility.Facility;

public class User {
    private Facility facility;
    private UseSchedule schedule;
    private String name;
    private UserType type;

    public User(){}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setUseSchedule(UseSchedule schedule){
        this.schedule = schedule;
    }

    public UseSchedule getUseSchedule(){
        return schedule;
    }

    public void setUserType(UserType type){
        this.type = type;
    }

    public UserType getUserType(){
        return type;
    }

    public void setFacility(Facility facility){ this.facility = facility; }

    public Facility getFacility(){
        return facility;
    }

}
