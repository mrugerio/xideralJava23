package Patterns.memento;

import Patterns.observer.Votes;

public class Originator {
    private Votes votes;

    public Votes getVotes() { return votes;}

    public void setVotes(Votes votos) {
        Votes _votos = new Votes();
        _votos.setJuan(votos.getJuan());
        _votos.setLuis(votos.getLuis());
        _votos.setPedro(votos.getPedro());
        this.votes = _votos;
    }
   
    public Memento Save(){
        return new Memento(votes);
    }
    
    public void Undo(Memento m){
        this.votes = m.getVotes();
    }

}
