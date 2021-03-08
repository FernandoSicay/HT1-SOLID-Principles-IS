package gt.edu.umg.solidPrinciplesHt1.model;


import java.util.ArrayList;
import java.util.List;

public class McDonnalsAPI {
    protected String name;
    protected int price;

    public List<Object> bigMc(){
        List<Object> menu = new ArrayList();

        this.name = "bigMc";
        this.price = 35;

        menu.add(this.name);
        menu.add(this.price);

        return menu;
    }
}
