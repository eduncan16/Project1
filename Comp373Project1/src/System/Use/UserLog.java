package System.Use;

import System.Maintenance.MaintenanceOrder;

import java.util.ArrayList;
import java.util.List;

public class UserLog {
    private List<User> userLog = new ArrayList<User>();

    public UserLog(){}

    public void addUser(User user){
        userLog.add(user);
    }

    public List<User> getLog(){
        return userLog;
    }
}
