package gt.edu.umg.solidPrinciplesHt1.model.entity;

public abstract class SpaceShip {

    protected String name;


    public String takeoff(){
        return "Taking off...";
    }

    public String missionInfo(){
        return "Mission Name: " + this.name;
    }
}
