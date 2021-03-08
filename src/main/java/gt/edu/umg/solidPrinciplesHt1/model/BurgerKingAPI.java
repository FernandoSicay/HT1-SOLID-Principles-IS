package gt.edu.umg.solidPrinciplesHt1.model;


import java.util.ArrayList;
import java.util.List;

public class BurgerKingAPI implements ITodayMenu{
    protected String name;
    protected int price;

    public List<Object> kingMenu(){
        List<Object> menu = new ArrayList();

        this.name = "king Menu";
        this.price = 40;

        menu.add(this.name);
        menu.add(this.price);

        return menu;
    }

    @Override
    public List<Object> getMenu() {
        return kingMenu();
    }
}
