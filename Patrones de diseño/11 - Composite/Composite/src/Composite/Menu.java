package Composite;
/**
*@author Victor Lavalle
*/
import java.util.ArrayList;

public class Menu extends ComponentMenu{
    ArrayList <ComponentMenu> items;
    
    @Override
    public String toPrint() {
        return this.getName();
    }
    
    public ArrayList<ComponentMenu> getItems(){
        return items;
	}
    
    public void addItem(ComponentMenu subMenu) {
        this.items.add(subMenu);
	}
	
}
