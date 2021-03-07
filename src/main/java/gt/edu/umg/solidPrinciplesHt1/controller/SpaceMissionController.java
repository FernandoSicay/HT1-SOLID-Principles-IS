package gt.edu.umg.solidPrinciplesHt1.controller;


import gt.edu.umg.solidPrinciplesHt1.model.service.SpaceMissionsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceMissionController {

    @GetMapping("/spaceMissions")
    public String getSpaceMissionsInfo(){
        return new SpaceMissionsManager().missionsInfo();
    }
}