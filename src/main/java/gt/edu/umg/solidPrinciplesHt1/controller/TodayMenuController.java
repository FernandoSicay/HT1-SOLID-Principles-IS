package gt.edu.umg.solidPrinciplesHt1.controller;


import gt.edu.umg.solidPrinciplesHt1.model.BurgerKingAPI;
import gt.edu.umg.solidPrinciplesHt1.model.McDonnalsAPI;
import gt.edu.umg.solidPrinciplesHt1.model.TodayMenu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodayMenuController {

    @GetMapping("/todayMcDonnalsMenu")
    public String getTodayMcDonnalsMenu(){
        return new TodayMenu(new McDonnalsAPI()).getTodayMenu();
    }
    @GetMapping("/todayBurgerKingMenu")
    public String getTodayBurgerKingMenu(){
        return new TodayMenu(new BurgerKingAPI()).getTodayMenu();
    }
}