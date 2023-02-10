package Composite;

/**
 * @author Victor Lavalle
 */
import java.text.DecimalFormat;

public class MenuItem extends ComponentMenu{
    private  double  price;   
    DecimalFormat formatPrice = new DecimalFormat("#.00"); 
   
    @Override
    public String toPrint() {
        return "»"+this.getName() + ": $" +  formatPrice.format(price);
	}
}
