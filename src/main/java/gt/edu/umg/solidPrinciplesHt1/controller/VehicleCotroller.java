package gt.edu.umg.solidPrinciplesHt1.controller;


import gt.edu.umg.solidPrinciplesHt1.model.VehicleManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleCotroller {

    @GetMapping("/carActtions")
    public List<String> getCarActtions(){
        return new VehicleManager().getAllCarActions();
    }
    @GetMapping("/planeActtions")
    public List<String> getPlaneActtions(){
        return new VehicleManager().getAllPLaneActions();
    }
}