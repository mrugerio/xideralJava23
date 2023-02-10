package Pattern;

import java.io.PrintWriter;
import java.util.Arrays;
/**
 * @author Victor Lavalle
 */
public class ExcelGenerator implements Observer{
    
    @Override
    public void update(int[] votes, String[] nominees) {

        try (PrintWriter esc = new PrintWriter("ObserverVotes.csv")) {
            StringBuilder vote= new StringBuilder();
            for (int j : votes) {
                vote.append(j).append(",");
            }
            esc.println(Arrays.toString(nominees));
            esc.println(vote);
        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
}
