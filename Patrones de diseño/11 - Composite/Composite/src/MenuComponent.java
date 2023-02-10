/**
 * @author Victor Lavalle
 */
public abstract class MenuComponent {

    private String Name;
       
    public String getName() { return Name; }
    public void setName(String Name) { this.Name = Name;}

     public abstract String toPrint();

}
