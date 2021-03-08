package gt.edu.umg.solidPrinciplesHt1.model;

public class Plane implements IVehicle{

    @Override
    public String starEngine() {
        return "Startinh Engining...";
    }

    @Override
    public String brake() {
        return "Braking vehicle";
    }

    @Override
    public String turnRight() {
        return "turning right";
    }

    @Override
    public String turnLeft() {
        return "turning left";
    }

    @Override
    public String takeOff() {
        return "taking off";
    }

    @Override
    public String fly() {
        return "flying";
    }
}
