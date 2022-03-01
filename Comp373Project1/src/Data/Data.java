package Data;

import System.Facility.Facility;
import System.Facility.FacilityDetails;
import System.Facility.FacilityManager;
import System.Facility.FacilityType;
import System.Maintenance.MaintenaceLog;
import System.Maintenance.MaintenanceCost;
import System.Maintenance.MaintenanceOrder;
import System.Maintenance.MaintenanceRequest;
import System.Use.*;

import java.util.Date;

public class Data {
    public static void main(String args[]) {
        Facility one = new Facility();
        FacilityDetails oneDetails = new FacilityDetails();
        FacilityType house = new FacilityType();
        house.setDescription("A residential house");

        oneDetails.setFacilityName("one");
        oneDetails.setFacilityIDNumber(1);
        oneDetails.setCapacity(1);
        oneDetails.setAddress("1111 1st st, one, IL");
        oneDetails.setType(house);

        System.out.println("One Details");
        System.out.println(oneDetails.getFacilityName());
        System.out.println(oneDetails.getFacilityIDNumber());
        System.out.println(oneDetails.getCapacity());
        System.out.println(oneDetails.getAddress());
        System.out.println(oneDetails.getType());

        Facility two = new Facility();
        FacilityDetails twoDetails = new FacilityDetails();
        twoDetails.setFacilityName("two");
        twoDetails.setFacilityIDNumber(2);
        twoDetails.setCapacity(2);
        twoDetails.setAddress("2222 2nd st, two, IL");
        twoDetails.setType(house);

        System.out.println("----------------------");
        System.out.println("Two Details");
        System.out.println(twoDetails.getFacilityName());
        System.out.println(twoDetails.getFacilityIDNumber());
        System.out.println(twoDetails.getCapacity());
        System.out.println(twoDetails.getAddress());
        System.out.println(twoDetails.getType());

        FacilityManager group1 = new FacilityManager();
        group1.addFacility(one);
        group1.addFacility(two);
        System.out.println("-------------------------");
        System.out.println(group1.getFacilities());
        group1.removeFacility(one);
        System.out.println(group1.getFacilities());
        group1.addFacility(one);
        System.out.println(group1.getFacility(1));

        MaintenaceLog maintenaceLog = new MaintenaceLog();
        MaintenanceRequest lights = new MaintenanceRequest();
        lights.setDescription("Light fixture broke");
        Date today = new Date(2020, 2, 28);
        lights.setRequestDate(today);
        MaintenanceOrder fixLight = new MaintenanceOrder(lights);
        MaintenanceCost lightCost = new MaintenanceCost();
        lightCost.setlaborCost(80);
        lightCost.setmaterialsCost(30);
        fixLight.setCost(lightCost);
        fixLight.setStartDate(today);

        System.out.println("----------------------");

        System.out.println(fixLight.getStartDate());
        System.out.println(fixLight.getMaintenanceCost().getlaborCost());
        System.out.println(fixLight.getMaintenanceCost().getmaterialsCost());
        System.out.println(fixLight.getStartDate());
        maintenaceLog.addOrder(fixLight);

        System.out.println("----------------------");

        User evan = new User();
        evan.setFacility(one);
        evan.setName("Evan Duncan");
        UseSchedule evanSchedule = new UseSchedule(evan.getFacility());

        UseRequest evanUseRequest = new UseRequest();
        evanUseRequest.setStartDate(today);
        Date tomorrow = new Date(2020, 2, 29);
        evanUseRequest.setEndDate(tomorrow);
        evanUseRequest.setRequestDate(today);
        evanUseRequest.setDescription("I want facility 1 for 1 day :)");

        System.out.println(evanUseRequest.getRequestDate());
        System.out.println(evanUseRequest.getDescription());
        System.out.println(evanUseRequest.getStartDate());
        System.out.println(evanUseRequest.getEndDate());
        System.out.println(evanUseRequest.getUseStatus());

        UserType resident = new UserType();
        resident.setDescription("Living in facility :)");

        evanSchedule.acceptUseRequest(evanUseRequest);
        evanUseRequest.getUseStatus();
        evan.setUseSchedule(evanSchedule);
        evan.setUserType(resident);
        System.out.println("-----------------------------");
        System.out.println(evan.getName());
        System.out.println(evan.getUseSchedule().getUseRequests().get(0).getUseStatus());
        System.out.println(evan.getUserType().getDescription());

        System.out.println("-----------------------------");
        UserLog userLog = new UserLog();
        userLog.addUser(evan);
        System.out.println(userLog.getLog().get(0).getName());

    }
}
