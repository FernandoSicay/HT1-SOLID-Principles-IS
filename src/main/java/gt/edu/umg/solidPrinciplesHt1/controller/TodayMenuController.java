package gt.edu.umg.solidPrinciplesHt1.controller;


import gt.edu.umg.solidPrinciplesHt1.model.TodayMenu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodayMenuController {

    @GetMapping("/todayMenu")
    public String getDayMenu(){
        return new TodayMenu().getTodayMenu();
    }
}