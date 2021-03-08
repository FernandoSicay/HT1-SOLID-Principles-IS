package gt.edu.umg.solidPrinciplesHt1.model;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {

    public List<String> getAllCarActions(){

       List<String> carMethods = new ArrayList<>();
       IVehicle car = new Car();
       carMethods.add(car.brake());
       carMethods.add(car.starEngine());
       carMethods.add(car.turnRight());
       carMethods.add(car.turnLeft());
       carMethods.add(car.fly());
       carMethods.add(car.takeOff());


       return carMethods;
    }
    public List<String> getAllPLaneActions(){

        List<String> planeActions = new ArrayList<>();
        IVehicle plane = new Plane();
        planeActions.add(plane.brake());
        planeActions.add(plane.starEngine());
        planeActions.add(plane.turnRight());
        planeActions.add(plane.turnLeft());
        planeActions.add(plane.fly());
        planeActions.add(plane.takeOff());


        return planeActions;
    }

}
