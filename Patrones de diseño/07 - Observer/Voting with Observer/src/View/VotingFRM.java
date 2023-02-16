package View;
/**
 * @author Victor Lavalle
 */
import javax.swing.JButton;
import javax.swing.JPanel;
import java.util.Objects;

public final class VotingFRM extends javax.swing.JFrame {
    
 int Discord = 0;
 int Teams = 0;
 int Zoom = 0;
 
 CircleFRM c = new CircleFRM();
 BarsFRM b = new BarsFRM();

   
    public CircleFRM getC() {return c;}
    public void setC(CircleFRM c) { this.c = c; }

    public BarsFRM getB() {return b;}
    public void setB(BarsFRM b) {this.b = b; }

    public JButton getVote() { return Vote;  }
    public void setVote(JButton Vote) { this.Vote = Vote; }

    public JButton getVote2() { return Vote2;}
    public void setVote2(JButton Vote2) { this.Vote2 = Vote2;}

    public JButton getVote3() {return Vote3;}
    public void setVote3(JButton Vote3) { this.Vote3 = Vote3; }

    public JPanel getjPanel1() { return jPanel1;}
    public void setjPanel1(JPanel jPanel1) { this.jPanel1 = jPanel1; }
 
 
 

    public VotingFRM() {
        initComponents();
         this.setResizable(false);
        this.setLocation(480,460);
        this.setTitle("Voting System with Observer");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Name1 = new javax.swing.JLabel();
        Name2 = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Credits = new javax.swing.JLabel();
        ZoomIMG = new javax.swing.JLabel();
        DiscordIMG = new javax.swing.JLabel();
        TeamsIMG = new javax.swing.JLabel();
        Vote = new javax.swing.JButton();
        Vote2 = new javax.swing.JButton();
        Vote3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 33, 36));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name1.setForeground(new java.awt.Color(255, 255, 255));
        Name1.setText("a) Discord");
        jPanel1.add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        Name2.setForeground(new java.awt.Color(255, 255, 255));
        Name2.setText("b) Microsoft Teams");
        jPanel1.add(Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        Name3.setForeground(new java.awt.Color(255, 255, 255));
        Name3.setText("c) Zoom");
        jPanel1.add(Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        Title.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("WICH ONE DO YOU PREFER?");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 180, 20));

        Credits.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        Credits.setForeground(new java.awt.Color(51, 51, 51));
        Credits.setText("By Victor Lavalle");
        jPanel1.add(Credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        ZoomIMG.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Resources/Zoom1.png")))); // NOI18N
        jPanel1.add(ZoomIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 20, 20));

        DiscordIMG.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Resources/Discord.png")))); // NOI18N
        jPanel1.add(DiscordIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 20, 20));

        TeamsIMG.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Resources/Teams.png")))); // NOI18N
        jPanel1.add(TeamsIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 20, 20));

        Vote.setBackground(new java.awt.Color(187, 134, 252));
        Vote.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Vote.setText("VOTE");
        Vote.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Vote.addActionListener(this::VoteActionPerformed);
        jPanel1.add(Vote, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, 30));

        Vote2.setBackground(new java.awt.Color(187, 134, 252));
        Vote2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Vote2.setText("VOTE");
        Vote2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Vote2.addActionListener(this::Vote2ActionPerformed);
        jPanel1.add(Vote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, 30));

        Vote3.setBackground(new java.awt.Color(187, 134, 252));
        Vote3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Vote3.setText("VOTE");
        Vote3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Vote3.addActionListener(this::Vote3ActionPerformed);
        jPanel1.add(Vote3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoteActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_VoteActionPerformed

    private void Vote2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vote2ActionPerformed

    }//GEN-LAST:event_Vote2ActionPerformed

    private void Vote3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vote3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Vote3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VotingFRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Credits;
    private javax.swing.JLabel DiscordIMG;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel TeamsIMG;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Vote;
    private javax.swing.JButton Vote2;
    private javax.swing.JButton Vote3;
    private javax.swing.JLabel ZoomIMG;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
