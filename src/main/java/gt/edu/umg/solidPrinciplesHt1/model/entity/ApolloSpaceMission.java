package gt.edu.umg.solidPrinciplesHt1.model.entity;

public class ApolloSpaceMission extends SpaceShipManned {

    @Override
    public String takeoff() {
        return "Im taking off with humans";
    }

    @Override
    public String missionInfo() {

        super.name = "Apollo Space Mission";
        super.humansCuantity = 5;

        return "Mission Name: " + name + "Humans Cuantity = " +  humansCuantity;
    }
}
