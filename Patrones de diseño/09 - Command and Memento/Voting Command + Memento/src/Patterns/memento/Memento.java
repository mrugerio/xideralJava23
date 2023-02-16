package Patterns.memento;

import Patterns.observer.Votes;

public class Memento {
    private final Votes votes;

    public Memento(Votes votes) { this.votes = votes;}
    public Votes getVotes() {return votes;} 
}
