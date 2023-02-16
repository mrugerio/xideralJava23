import java.text.DecimalFormat;
/**
 * @author Victor Lavalle
 */
public class MenuItem extends MenuComponent {
    
    //In this case we generate random number from 1 to 100
    //for demonstration purposes
   double  price =(Math.random() * 100) + 1;
  DecimalFormat formatPrice = new DecimalFormat("#.00"); 
  
    @Override
    public String toPrint() {
            return "»"+this.getName()+ ": $" + formatPrice.format(price);
    } 
    
}
