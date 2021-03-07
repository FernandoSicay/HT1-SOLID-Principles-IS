package gt.edu.umg.solidPrinciplesHt1.model.entity;

public class ApolloSpaceMission extends SpaceShip {

    @Override
    public String takeoff() {
        return "Im taking off with humans";
    }

    @Override
    public String missionInfo() {

        super.name = "Apollo Space Mission";
        super.humansCuatity = 5;

        return "Mission Name: " + super.name + "Humans Cuantity = " +  super.humansCuatity;
    }
}
