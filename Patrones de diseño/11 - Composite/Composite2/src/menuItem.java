/**
 * @author Victor Lavalle
 */
public class menuItem extends menuComponent {
    
 String name, description;
 boolean vegetarian;
 double price;

 //Constructor
 public menuItem(String name,String description,boolean vegetarian, double price){
 super();
 this.name=name;
 this.description=description;
 this.vegetarian=vegetarian;
 this.price=price;
 }
 //Methods Get & Set
 public String getName() {return name;}
 public String getDescription() {return description;}
 public boolean isVegetarian() { return vegetarian; }
 public double getPrice() {return price;}
  
 public void setName(String name) {this.name = name;}
 public void setDescription(String description) { this.description = description;}
 public void setVegetarian(boolean vegetarian) { this.vegetarian = vegetarian;}
 public void setPrice(double price) { this.price = price;}
 
 
 @Override
 public String toString(){
 return name +" " + description + " : $"+price;
 }
 
 @Override
 public void showDescription(){
 System.out.println(" "+this);
 }
 
}