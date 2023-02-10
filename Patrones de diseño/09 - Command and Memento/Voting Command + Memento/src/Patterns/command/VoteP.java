package Patterns.command;

import Patterns.observer.Votes;

public class VoteP implements Command {

    @Override
    public void addVote(Votes nominees) {
        nominees.addPedro();
    }
}
