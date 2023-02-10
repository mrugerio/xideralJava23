package Composite;

/**
*@author Victor Lavalle
*/
public abstract class ComponentMenu {
    private String name;
	
    public String getName() {return name;}
    public void setName(String Name) {
        this.name = name;
	}
    
    public abstract String toPrint();

}
