package gt.edu.umg.solidPrinciplesHt1.model.entity;

public class SpaceShipManned extends SpaceShip{
    protected int humansCuantity;
    @Override
    public String takeoff() {
        return "Im taking off with humans";
    }

    @Override
    public String missionInfo() {
        return "Human-piloted mission supported from the operations center";
    }
}
