import java.util.ArrayList;
/**
 * @author Victor Lavalle
 */
public  class MenuGrouper extends MenuComponent {
    
    private String Name;
   ArrayList<MenuComponent>items= new ArrayList<>();
   
    @Override
    public String getName() {return Name; }
    
    @Override
    public void setName(String Name) {this.Name = Name; }
    
    public ArrayList<MenuComponent> getItems() {return items;}
    
    public void addItem(MenuComponent subMenu) {
        this.items.add(subMenu);
    }   
   
    @Override
    public String toPrint() {
      String dishes=Name+"\n";
        for(int i=0;i<items.size();i++){
            dishes+= items.get(i).toPrint()+"\n";
        }
        return dishes;
    }
}
