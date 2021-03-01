package gt.edu.umg.solidPrinciplesHt1.controller;

import gt.edu.umg.solidPrinciplesHt1.model.service.MissionApolloProgram;
import gt.edu.umg.solidPrinciplesHt1.model.service.MissionMercuryProgram;
import gt.edu.umg.solidPrinciplesHt1.model.service.SpaceMissionCalendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MercuryMissionController {
    @GetMapping("/spaceMission/1961")
    public String getNameSpaceMission(){
        return new SpaceMissionCalendar(new MissionMercuryProgram()).getNameSpaceMission();
    }
}
