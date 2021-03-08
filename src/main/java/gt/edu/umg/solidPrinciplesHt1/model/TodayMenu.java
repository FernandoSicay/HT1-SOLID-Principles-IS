package gt.edu.umg.solidPrinciplesHt1.model;

import com.sun.javafx.scene.layout.region.LayeredBackgroundSizeConverter;

import java.util.List;

public class TodayMenu {
    private String name;
    private int price;
    private List<Object> menu;

    public TodayMenu() {
        this.menu = new McDonnalsAPI().bigMc();
        this.name = (String) this.menu.get(0);
        this.price = (Integer) this.menu.get(1);
    }
    public String getTodayMenu(){

        return "Day menu: " + "<br>" + name + "<br>" + price;
    }
}
