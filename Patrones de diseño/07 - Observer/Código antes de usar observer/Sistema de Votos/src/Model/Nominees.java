package Model;
/**
 * @author Victor Lavalle
 */
public class Nominees {
    
   private String Name;
   private long Votes;

   //Constructor
    public Nominees(String Name) {
        this.Name = Name;
        this.Votes = 0;
    }
    
    //Methods Get & Set 
    public String getName() { return Name;}
    public long getVotes() {   return Votes;}
    
    public void setName(String Name) {this.Name = Name;}
    public void setVotes(long Votes) {this.Votes = Votes;}
    
    //Function to add votes account
     public void vote(){
          this.Votes= this.Votes+1;
    }
}
