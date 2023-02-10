/**
 * @author Victor Lavalle
 * Menu created statically for demonstration purposes
 */
public class Client {

    public static void main(String[] args) {
        
 //______________________________________   
    MenuGrouper Breakfast= new MenuGrouper();
    Breakfast.setName("Breakfast");
    
        MenuItem meal= new MenuItem();
        meal.setName("Fruit with Oatmeal");
        MenuItem meal2= new MenuItem();
        meal2.setName("Green Smoothie");
        MenuItem meal3= new MenuItem();
        meal3.setName("French Toast");  

    Breakfast.addItem(meal);
    Breakfast.addItem(meal2);
    Breakfast.addItem(meal3);
        
 //______________________________________       
    MenuGrouper Brunch= new MenuGrouper();
    Brunch.setName("Brunch");
    
       MenuItem meal4= new MenuItem();
       meal4.setName("Scrambled Eggs");
       MenuItem meal5 = new MenuItem();
       meal5.setName("Waffles");
       MenuItem meal6 = new MenuItem();
       meal6.setName("Club Sandwich");
       
    Brunch.addItem(meal4);
    Brunch.addItem(meal5);
    Brunch.addItem(meal6);
    
 //______________________________________      
    MenuGrouper Dinner = new MenuGrouper();
    Dinner.setName("Dinner"); 
    
       MenuItem meal7 = new MenuItem();
       meal7.setName("Mac & Cheese");
       MenuItem meal8 = new MenuItem();
       meal8.setName("Ceasar Salad");     
       MenuItem meal9 = new MenuItem();
       meal9.setName("Cheese Burger");

    Dinner.addItem(meal7);
    Dinner.addItem(meal8);
    Dinner.addItem(meal9);
    
 //______________________________________      
    MenuGrouper Desserts = new MenuGrouper();
    Desserts.setName("Desserts"); 
    
       MenuItem meal10 = new MenuItem();
       meal10.setName("Cheesecake");
       MenuItem meal11 = new MenuItem();
       meal11.setName("Brownie");     
       MenuItem meal12 = new MenuItem();
       meal12.setName("Icecream");

    Desserts.addItem(meal10);
    Desserts.addItem(meal11);
    Desserts.addItem(meal12);
    
 //______________________________________ 
   MenuGrouper completeMenu = new MenuGrouper();
   completeMenu.setName("    |COMPOSITE MENU|\n");
   
    completeMenu.addItem(Breakfast);
    completeMenu.addItem(Brunch);
    completeMenu.addItem(Dinner);
    completeMenu.addItem(Desserts);
    
   System.out.println(completeMenu.toPrint()); 
        
    }
    
}
