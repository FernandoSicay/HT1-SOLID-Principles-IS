package gt.edu.umg.solidPrinciplesHt1.model.entity;

public abstract class SpaceShip {

    protected String name;
    protected int humansCuatity;


    public String takeoff(){
        return "I am taking off";
    }

    public String missionInfo(){
        return "Mission info";
    }
}
