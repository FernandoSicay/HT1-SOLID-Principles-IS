package gt.edu.umg.solidPrinciplesHt1.model;


public class Car implements IMove, IEngine, IBrake{
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

}
