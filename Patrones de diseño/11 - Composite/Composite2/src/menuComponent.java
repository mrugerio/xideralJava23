
import java.util.ArrayList;

/**
 * @author Victor Lavalle
 */
public abstract class menuComponent {
    
 ArrayList<menuComponent> components;

 public menuComponent(){
 this.components=null;
 }

 public abstract void showDescription();

 public void addCompMenu(menuComponent menuComp){
 components.add(menuComp);
 }

 public void removeCompMenu(menuComponent menuComp){
 components.remove(menuComp);
 }
 
}
