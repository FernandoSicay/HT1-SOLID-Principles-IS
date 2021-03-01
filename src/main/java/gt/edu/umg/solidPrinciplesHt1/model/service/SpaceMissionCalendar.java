package gt.edu.umg.solidPrinciplesHt1.model.service;

public class SpaceMissionCalendar {
    private ISpaceMission spaceMission;

    public SpaceMissionCalendar(ISpaceMission spaceMission) {
        this.spaceMission = spaceMission;
    }

    public String getNameSpaceMission(){
        return this.spaceMission.getSpaceMissionName();
    }
}
