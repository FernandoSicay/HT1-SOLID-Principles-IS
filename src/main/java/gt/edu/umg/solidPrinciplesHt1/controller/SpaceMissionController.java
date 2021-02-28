package gt.edu.umg.solidPrinciplesHt1.controller;


import gt.edu.umg.solidPrinciplesHt1.model.SpaceMission;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceMissionController {

    @GetMapping("/spaceMission")
    public String getNameSpaceMission(@RequestParam String yearMission){
        SpaceMission spaceMission = new SpaceMission();
        return spaceMission.getNameMission(Integer.parseInt(yearMission));
    }
}