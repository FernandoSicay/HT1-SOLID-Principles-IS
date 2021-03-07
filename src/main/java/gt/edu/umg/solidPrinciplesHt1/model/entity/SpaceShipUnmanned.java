package gt.edu.umg.solidPrinciplesHt1.model.entity;

public class SpaceShipUnmanned extends SpaceShip{
    protected int roversCuantity;
    @Override
    public String takeoff() {
        return "Im taking off without humans";
    }

    @Override
    public String missionInfo() {
        return "Automated mission supported from the operations center";
    }
}
