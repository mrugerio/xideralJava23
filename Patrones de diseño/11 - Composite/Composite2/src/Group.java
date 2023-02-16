import java.util.ArrayList;
/**
 * @author Victor Lavalle
 */
public class Group extends menuComponent{
 private final String name;

 public Group(String name){
 this.name=name;
 this.components=new ArrayList<>();
 }
 
 @Override
 public void showDescription() {
   System.out.println("|"+name+"|");
   for(int i=0;i<components.size();i++)
   components.get(i).showDescription();
 }
 
 //Methods Get & Set
 public ArrayList<menuComponent> getComponentes() {
 return components;
 }
 
 public void setComponents(ArrayList<menuComponent> components) {
 this.components = components;
 }
 
 public String getName() {
 return name;
 }
}
