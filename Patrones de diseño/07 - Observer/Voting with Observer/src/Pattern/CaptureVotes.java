package Pattern;
/**
 * @author Victor Lavalle
 */
import View.VotingFRM;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaptureVotes extends Observed implements ActionListener {

 private final VotingFRM voting;
 private final int[] votes;
 private final String[] nominees;

 public CaptureVotes(String[] nominees){
    this.nominees = nominees;
     this.votes = new int[]{0, 0, 0};
    this.voting = new VotingFRM();
    notifyAll(this.votes, this.nominees);
    voting.getVote().addActionListener(this);
    voting.getVote2().addActionListener(this);
    voting.getVote3().addActionListener(this);
    voting.setVisible(true);
 }
 
  @Override
 public void actionPerformed(ActionEvent e) {
     
    if(e.getSource().equals(voting.getVote()) ){
        votes[0]++;
        notifyAll(votes, nominees);
   }

    if(e.getSource().equals(voting.getVote2())){
      votes[1]++;
      notifyAll(votes, nominees);
   }

   if(e.getSource().equals(voting.getVote3()) ){
     votes[2] ++;
     notifyAll(votes, nominees);
   }
 
 }
}
