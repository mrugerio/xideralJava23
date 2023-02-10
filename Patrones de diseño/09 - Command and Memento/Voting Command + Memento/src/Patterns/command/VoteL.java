package Patterns.command;

import Patterns.observer.Votes;

public class VoteL implements Command{

    @Override
    public void addVote(Votes nominees) {
        nominees.addLuis();
    }    
}
