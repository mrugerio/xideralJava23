package Patterns.command;
/**
 * @author Victor Lavalle
 */
import Patterns.observer.Votes;

public interface Command {
    public void addVote(Votes nominees);
}
