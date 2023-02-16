package View;

import Patterns.memento.*;
import Patterns.command.*;
import Patterns.observer.*;
/**
 * @author Victor Lavalle
 */
public class UIvotes extends javax.swing.JFrame {

    private Observed ob;
    int[]votes= new int [3];
    String [] nominees={"Juan","Luis","Pedro"};
    VoteJ vj = new VoteJ();
    VoteL vl = new VoteL();
    VoteP vp = new VoteP();
    Votes _votes= new Votes();
    Originator or = new Originator();
    CareTaker Ct = new CareTaker();
    
    public void setOb(Observed ob) {this.ob = ob;}

    public UIvotes() {
        initComponents();
        this.setLocationRelativeTo(null);
        _votes.setJuan(0);
        _votes.setLuis(0);
        _votes.setPedro(0);
        or.setVotes(_votes);
        Ct.addMemento(or.Save());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Vote2 = new javax.swing.JButton();
        Vote1 = new javax.swing.JButton();
        Vote3 = new javax.swing.JButton();
        Undo = new javax.swing.JButton();
        Name1 = new javax.swing.JLabel();
        Name2 = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Credits = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 33, 36));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Vote2.setBackground(new java.awt.Color(187, 134, 252));
        Vote2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Vote2.setForeground(new java.awt.Color(255, 255, 255));
        Vote2.setText("VOTE");
        Vote2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vote2ActionPerformed(evt);
            }
        });
        jPanel1.add(Vote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        Vote1.setBackground(new java.awt.Color(187, 134, 252));
        Vote1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Vote1.setForeground(new java.awt.Color(255, 255, 255));
        Vote1.setText("VOTE");
        Vote1.setActionCommand("Vote1");
        Vote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vote1ActionPerformed(evt);
            }
        });
        jPanel1.add(Vote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        Vote3.setBackground(new java.awt.Color(187, 134, 252));
        Vote3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Vote3.setForeground(new java.awt.Color(255, 255, 255));
        Vote3.setText("VOTE");
        Vote3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vote3ActionPerformed(evt);
            }
        });
        jPanel1.add(Vote3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        Undo.setBackground(new java.awt.Color(57, 255, 20));
        Undo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Undo.setForeground(new java.awt.Color(255, 255, 255));
        Undo.setText("UNDO");
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });
        jPanel1.add(Undo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 30));

        Name1.setForeground(new java.awt.Color(255, 255, 255));
        Name1.setText("b) Luis");
        jPanel1.add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        Name2.setForeground(new java.awt.Color(255, 255, 255));
        Name2.setText("a) Juan");
        jPanel1.add(Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        Name3.setForeground(new java.awt.Color(255, 255, 255));
        Name3.setText("c) Pedro");
        jPanel1.add(Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        Title.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("VOTING SYSTEM");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 110, 20));

        Credits.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        Credits.setForeground(new java.awt.Color(51, 51, 51));
        Credits.setText("By Victor Lavalle");
        jPanel1.add(Credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Vote2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vote2ActionPerformed
      or.setVotes(_votes);
      Ct.addMemento(or.Save());
      vj.addVote(_votes);
       votes[0]=_votes.getJuan();
       votes[1]=_votes.getLuis();
       votes[2]=_votes.getPedro();
       ob.notifyAll(nominees, votes);
    }//GEN-LAST:event_Vote2ActionPerformed

    private void Vote1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vote1ActionPerformed
      or.setVotes(_votes);
      Ct.addMemento(or.Save());
       vl.addVote(_votes);
       votes[0]=_votes.getJuan();
       votes[1]=_votes.getLuis();
       votes[2]=_votes.getPedro();
       ob.notifyAll(nominees, votes);
    }//GEN-LAST:event_Vote1ActionPerformed

    private void Vote3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vote3ActionPerformed
       or.setVotes(_votes);
       Ct.addMemento(or.Save());
       vp.addVote(_votes);
       votes[0]=_votes.getJuan();  
       votes[1]=_votes.getLuis();
       votes[2]=_votes.getPedro();
       ob.notifyAll(nominees, votes);
    }//GEN-LAST:event_Vote3ActionPerformed

    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoActionPerformed
        or.Undo(Ct.getMemento());
        _votes.setJuan(or.getVotes().getJuan());
        _votes.setLuis(or.getVotes().getLuis());
        _votes.setPedro(or.getVotes().getPedro());
        votes[0]= or.getVotes().getJuan();
        votes[1]= or.getVotes().getLuis();
        votes[2]= or.getVotes().getPedro();
       ob.notifyAll(nominees, votes); 
    }//GEN-LAST:event_UndoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIvotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIvotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIvotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIvotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIvotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Credits;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Undo;
    private javax.swing.JButton Vote1;
    private javax.swing.JButton Vote2;
    private javax.swing.JButton Vote3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
