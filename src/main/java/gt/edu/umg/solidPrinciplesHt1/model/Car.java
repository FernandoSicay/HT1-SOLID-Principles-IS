package gt.edu.umg.solidPrinciplesHt1.model;


public class Car implements IVehicle{
    @Override
    public String starEngine() {
        return "Starting Engining...";
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
        return new UnsupportedOperationException().getMessage() + " I can't take off";
    }

    @Override
    public String fly() {
        return new UnsupportedOperationException().getMessage() + " I can´t fly";
    }
}
