package Methods;

import java.io.PrintWriter;
import Patterns.observer.Observer;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * @author Victor Lavalle
 */
public class CSVGenerator  implements Observer {

   @Override
    public void update(String []nominees,int[]votes) {
      
         try{
            PrintWriter esc = new PrintWriter("Results.csv");
            String vote="";
            for(int i=0;i<votes.length;i++){
                vote+=votes[i]+",";
            }
            esc.println(Arrays.toString(nominees));
            esc.println(vote); 
            esc.close();        
        }
         catch(FileNotFoundException e){}
    }
}
