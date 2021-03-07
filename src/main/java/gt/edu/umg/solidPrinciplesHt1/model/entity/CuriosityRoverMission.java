package gt.edu.umg.solidPrinciplesHt1.model.entity;

public class CuriosityRoverMission extends SpaceShip{
    

    @Override
    public String takeoff() {
        return "Im taking off with humans";
    }

    @Override
    public String missionInfo() {
        super.name = "Curiosity Rover Mission";
        super.humansCuatity = 0;

        return "Mission Name: " + super.name + "Humans Cuantity = "+  "Sorry. I can't transport humans";
    }
}
