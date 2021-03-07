package gt.edu.umg.solidPrinciplesHt1.model.entity;

public class CuriosityRoverMission extends SpaceShipUnmanned{
    

    @Override
    public String takeoff() {
        return "Im taking off with humans";
    }

    @Override
    public String missionInfo() {
        super.name = "Curiosity Rover Mission";
        super.roversCuantity = 2;

        return "Mission Name: " + name + "Humans Cuantity = " + roversCuantity;
    }
}
