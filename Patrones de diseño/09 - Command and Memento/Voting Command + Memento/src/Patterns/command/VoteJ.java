package Patterns.command;

import Patterns.observer.Votes;

public class VoteJ implements Command {

    @Override
    public void addVote(Votes nominees) {
        nominees.addJuan();
    } 
}
