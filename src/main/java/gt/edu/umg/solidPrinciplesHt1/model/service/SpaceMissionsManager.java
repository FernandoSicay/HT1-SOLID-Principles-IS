package gt.edu.umg.solidPrinciplesHt1.model.service;

import gt.edu.umg.solidPrinciplesHt1.model.entity.ApolloSpaceMission;
import gt.edu.umg.solidPrinciplesHt1.model.entity.CuriosityRoverMission;
import gt.edu.umg.solidPrinciplesHt1.model.entity.SpaceShip;



public class SpaceMissionsManager {
    public String takeoff(SpaceShip spaceShip){
        return  spaceShip.takeoff();
    }

    public String missionsInfo(){

        SpaceShip apolloMission = new ApolloSpaceMission();
        SpaceShip curiosityRoverMission = new CuriosityRoverMission();

        return apolloMission.missionInfo() + "<br>" + curiosityRoverMission.missionInfo();
    }

}
