package System.Client;

import java.util.List;
import System.Facility.Facility;
import System.Facility.FacilityDetails;
import System.Facility.FacilityManager;
import System.Facility.FacilityType;
import System.Maintenance.*;
import System.Use.*;
import com.sun.tools.javac.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;

public class Client {

    public static void main (String args[]) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        //Spring to inject the right object implementation in CustomerService for customer using Setter Injection
        //Also, bootstrapping the CustomerService instantiation using factory
        Facility facility1 = (Facility) context.getBean("Facility");
        facility1.setFacilityID(1);
        FacilityType facilityType = (FacilityType) context.getBean("FacilityType");
        FacilityManager facilityManager = (FacilityManager) context.getBean("FacilityManager");

        FacilityDetails facilityDetails = facility1.getFacilityDetail();
        facilityDetails.setFacilityName("Facility1");
        facilityDetails.setFacilityIDNumber(1);
        facilityDetails.setCapacity(1);
        facilityDetails.setAddress("1111 1st street IL");
        facilityDetails.setType(facilityType);

        facility1.setFacilityDetail(facilityDetails);
        facilityManager.addFacility(facility1);

        /**********************************************************************/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
        MaintenanceRequest maintenanceRequest = (MaintenanceRequest) context.getBean("MaintenanceRequest");
        maintenanceRequest.setRequestDate(sdf.parse("2022/01/01"));
        maintenanceRequest.setDescription("pipe leak");
        maintenanceRequest.setStatus(false);

        MaintenanceCost maintenanceCost = (MaintenanceCost) context.getBean("MaintenanceCost");
        MaintenanceInspection maintenanceInspection = (MaintenanceInspection) context.getBean("MaintenanceInspection");
        maintenanceInspection.setInspectionDate(sdf.parse("2022/01/01"));

        MaintenanceOrder maintenanceOrder = (MaintenanceOrder) context.getBean("MaintenanceOrder");
        maintenanceOrder.setStartDate(sdf.parse("2022/01/01"));
        maintenanceOrder.setCost(maintenanceCost);
        maintenanceOrder.setFinishDate(sdf.parse("2022/01/01"));

        MaintenanceLog maintenanceLog = (MaintenanceLog) context.getBean("MaintenanceLog");
        maintenanceLog.addOrder(maintenanceOrder);

        /**********************************************************************/

        User user = (User) context.getBean("User");
        user.setFacility(facility1);

        UserType userType = (UserType) context.getBean("UserType");
        user.setUserType(userType);

        UseRequest useRequest = (UseRequest) context.getBean("UseRequest");
        useRequest.setRequestDate(sdf.parse("2022/01/01"));
        useRequest.setEndDate(sdf.parse("2024/01/01"));
        useRequest.setStartDate(sdf.parse("2023/01/01"));
        useRequest.setUseStatus(false);

        UseSchedule useSchedule = (UseSchedule) context.getBean("UseSchedule");
        useSchedule.setFacility(facility1);
        useSchedule.acceptUseRequest(useRequest);

        UserLog userLog = (UserLog) context.getBean("UserLog");
        userLog.addUser(user);

        /**********************************************************************/

        // Print out all logs
        for(int i=0; i<userLog.getLog().size(); i++){
            User dummy = userLog.getLog().get(i);
            System.out.println("Name:"+dummy.getName()+"\nFacility:Facility#"+dummy.getFacility().getFacilityID()+"\nType:"
                    +dummy.getUserType().getDescription());
        }
        for(int i=0; i<maintenanceLog.getLog().size(); i++){
            MaintenanceOrder dummy = maintenanceLog.getLog().get(i);
            double x = dummy.getMaintenanceCost().getLaborCost();
            double y = dummy.getMaintenanceCost().getMaterialsCost();
            double z = x+y;
            System.out.println("\nStartDate:"+dummy.getStartDate()+"\nEndDate:"+dummy.getFinishDate()+"\nTotalCost:"+z+
                    "\nLaborCost:"+x+"\nMaterialsCost"+y);
        }
        for(int i=0; i<useSchedule.getUseRequests().size(); i++){
            UseRequest dummy = useSchedule.getUseRequests().get(i);
            System.out.println("\nRequestDate:"+dummy.getRequestDate()+"\nStartDate:"+dummy.getStartDate()+
                    "\nEndDate:"+dummy.getEndDate()+"\nDescription:"+ dummy.getDescription());
        }

    }

}

