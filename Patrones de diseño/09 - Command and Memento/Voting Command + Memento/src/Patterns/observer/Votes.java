package Patterns.observer;
/**
 * @author Victor Lavalle
 */
public class Votes {
    private int Juan, Pedro, Luis;
    
//Methods Get & Set
    public int getJuan() {return Juan; }
    public int getPedro() {return Pedro; }
    public int getLuis() {return Luis;} 
    
    public void setJuan(int Juan) {this.Juan = Juan;}
    public void setPedro(int Pedro) {this.Pedro = Pedro;}
    public void setLuis(int Luis) { this.Luis = Luis; }
    
//Votes Counter
    public void addPedro(){Pedro++; }
    public void addJuan(){Juan++;}
    public void addLuis(){ Luis++; }
}
