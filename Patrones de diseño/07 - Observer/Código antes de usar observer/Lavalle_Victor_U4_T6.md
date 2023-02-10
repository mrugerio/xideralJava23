##### **Código Fuente**

```java
package Controller;
/**
 * @author Victor Lavalle
 * This project was made base in:
 * http://lineadecodigo.com/java/graficos-de-torta-y-barras-con-  jfreechart/
 * http://panamahitek.com/graficando-en-java-con-jfreechart/
 */
import Model.*;
import View.MainVotingFRM;
import javax.swing.JFrame;

public class Controller {
    private MainVotingFRM view;
    private Nominees Opt1;
    private Nominees Opt2;
    private Nominees Opt3;
    private BarGraph bars;
    private CircleGraph circle;
    private JFrame windowBars;
    private JFrame windowCircle;

    //Methods Get
    public JFrame getWindowBars() {return windowBars;}
    public JFrame getWindowCircle() { return windowCircle; }
    public BarGraph getBars() { return bars; }   
    public CircleGraph getCircle() {return circle; }
    public MainVotingFRM getView() { return view; }  
    public Nominees getOpt1() { return Opt1; }
    public Nominees getOpt2() { return Opt2; }
    public Nominees getOpt3() {return Opt3; }
    
    //Methods Set
    public void setWindowBars(JFrame windowBars) { this.windowBars = windowBars; }
    public void setWindowCircle(JFrame windowCircle) {this.windowCircle =windowCircle; }
    public void setBars(BarGraph bars) { this.bars = bars;}
    public void setCircle(CircleGraph circle) { this.circle = circle; }
    public void setView(MainVotingFRM view) { this.view = view; }
    public void setOpt1(Nominees Opt1) { this.Opt1 = Opt1;}
    public void setOpt2(Nominees Opt2) { this.Opt2 = Opt2; }
    public void setOpt3(Nominees Opt3) { this.Opt3 = Opt3; }
  
   //Constructor of good luck for the graphs :)
   public void GenerateGraph1(){ }
   public void GenerateGraph2(){ }
   
   /*
   *Functions that work with the 3 buttons of the mainframe
   *to pass parameters to create the graphs
   */
   public void Vote1(){
       this.Opt1.vote();
       this.bars.setWindow(windowBars);
       this.circle.setWindow(windowCircle);
       this.bars.data(Opt1, Opt2, Opt3);
       this.circle.data(Opt1, Opt2, Opt3);
    }
   
    public void Vote2(){
       this.Opt2.vote();
       this.bars.setWindow(windowBars);
       this.circle.setWindow(windowCircle);
       this.bars.data(Opt1, Opt2, Opt3);
       this.circle.data(Opt1, Opt2, Opt3);
    }
    
    public void Vote3(){
       this.Opt3.vote();
       this.bars.setWindow(windowBars);
       this.circle.setWindow(windowCircle);
       this.bars.data(Opt1, Opt2, Opt3);
       this.circle.data(Opt1, Opt2, Opt3);
    }
}
```

```java
package Model;
/**
 * @author Victor Lavalle
 */
import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarGraph {
    
    JFrame Window;
    JFreeChart Graph;
     public static final Color Lime = new Color(0x80,0xFF,0x00);
    
    //Methods Get & Set
    public JFrame getWindow() { return Window;}
    public JFreeChart getGraph() {return Graph; }
    
    public void setWindow(JFrame Window) {this.Window = Window;}
    public void setGraph(JFreeChart Graph) {this.Graph = Graph;}
    
    //Function that conatins the data fot the graph
    public void data(Nominees Opt1,Nominees Opt2,Nominees Opt3){
        
        DefaultCategoryDataset Data = new DefaultCategoryDataset();
         Data.addValue(Opt1.getVotes(), Opt1.getName(), Opt1.getName());
         Data.addValue(Opt2.getVotes(), Opt2.getName(), Opt2.getName());
         Data.addValue(Opt3.getVotes(), Opt3.getName(), Opt3.getName());

        Graph = ChartFactory.createBarChart3D("Results","Nominees", "Votes", Data,PlotOrientation.VERTICAL, true, true, false);
        Graph.setBackgroundPaint(Lime);
        ChartPanel Panel = new ChartPanel(Graph);
        Window.getContentPane().add(Panel);
        Window.pack();
        Window.setVisible(true);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```

```java
package Model;
/**
 * @author Victor Lavalle
 */
import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class CircleGraph {
    JFrame Window;
    JFreeChart Graph;
     public static final Color Lime = new Color(0x80,0xFF,0x00);
    //Methods Get & Set
    public JFrame getWindow() { return Window;}
    public JFreeChart getGraph() {return Graph;}
    
    public void setWindow(JFrame Window) { this.Window = Window;}
    public void setGraph(JFreeChart Graph) { this.Graph = Graph;}
    
    //Function that conatins the data fot the graph
    public void data(Nominees Opt1,Nominees Opt2,Nominees Opt3){
        
       DefaultPieDataset Data = new DefaultPieDataset();
       Data.setValue(Opt1.getName(), Opt1.getVotes());
       Data.setValue(Opt2.getName(), Opt2.getVotes());
       Data.setValue(Opt3.getName(), Opt3.getVotes());
       
       Graph = ChartFactory.createPieChart3D("Results", Data);
       Graph.setBackgroundPaint(Lime);
       ChartPanel Panel = new ChartPanel(Graph);
        Window.getContentPane().add(Panel);
        Window.pack();
        Window.setVisible(true);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```

```java
package Model;
/**
 * @author Victor Lavalle
 */
public class Nominees {
    
   private String Name;
   private long Votes;

   //Constructor
    public Nominees(String Name) {
        this.Name = Name;
        this.Votes = 0;
    }
    
    //Methods Get & Set 
    public String getName() { return Name;}
    public long getVotes() {   return Votes;}
    
    public void setName(String Name) {this.Name = Name;}
    public void setVotes(long Votes) {this.Votes = Votes;}
    
    //Function to add votes account
     public void vote(){
          this.Votes= this.Votes+1;
    }
}
```

```java
package View;
/**
 * @author Victor Lavalle
 */
import Controller.Controller;
import javax.swing.JButton;
import javax.swing.JLabel;

public final class MainVotingFRM extends javax.swing.JFrame {
    
    private Controller ctrl;
    
    //Methods Get & Set
    public Controller getCtrl() {return ctrl; }
    public JButton getVote() {   return Vote;}
    public JButton getVote2() { return Vote2; }
    public JButton getVote3() { return Vote3; }
    public JLabel getName1() { return Name1;}
    public JLabel getName2() { return Name2;}
    public JLabel getName3() { return Name3;}
    
    public void setCtrl(Controller ctrl) { this.ctrl = ctrl;}
    public void setVote(JButton Vote) { this.Vote = Vote;}
    public void setVote2(JButton Vote2) { this.Vote2 = Vote2; }
    public void setVote3(JButton Vote3) { this.Vote3 = Vote3; }
    public void setName1(JLabel Name1) { this.Name1 = Name1; }
    public void setName2(JLabel Name2) { this.Name2 = Name2;}
    public void setName3(JLabel Name3) {this.Name3 = Name3; }

    public MainVotingFRM() {
        initComponents();
         this.setResizable(false);
        this.setLocation(480,460);
        this.setTitle("Voting System");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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

        ZoomIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Zoom1.png"))); // NOI18N
        jPanel1.add(ZoomIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 20, 20));

        DiscordIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Discord.png"))); // NOI18N
        jPanel1.add(DiscordIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 20, 20));

        TeamsIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Teams.png"))); // NOI18N
        jPanel1.add(TeamsIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 20, 20));

        Vote.setBackground(new java.awt.Color(187, 134, 252));
        Vote.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Vote.setText("VOTE");
        Vote.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Vote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteActionPerformed(evt);
            }
        });
        jPanel1.add(Vote, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, 30));

        Vote2.setBackground(new java.awt.Color(187, 134, 252));
        Vote2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Vote2.setText("VOTE");
        Vote2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Vote2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vote2ActionPerformed(evt);
            }
        });
        jPanel1.add(Vote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, 30));

        Vote3.setBackground(new java.awt.Color(187, 134, 252));
        Vote3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Vote3.setText("VOTE");
        Vote3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Vote3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vote3ActionPerformed(evt);
            }
        });
        jPanel1.add(Vote3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 200));

        pack();
    }// </editor-fold>                        

    private void VoteActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           this.ctrl.Vote1();
    }                                    

    private void Vote2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        this.ctrl.Vote2();
    }                                     

    private void Vote3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        this.ctrl.Vote3();
    }                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainVotingFRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
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
    // End of variables declaration                   
}

```

```java
package Launcher;
/**
 * @author Victor Lavalle
 */
import Controller.Controller;
import Model.*;
import View.*;
import javax.swing.JFrame;

public class Launcher {
    
    public static MainVotingFRM view;
    public static JFrame windowBars;
    public static JFrame windowCircle;
    public static Nominees opt1;
    public static Nominees opt2;
    public static Nominees opt3;     
    public static Controller ctrl;
    public static BarGraph bars;
    public static CircleGraph circle;
    
    public static void main(String[] args) {
       
        opt1 = new Nominees("Discord");
        opt2 = new Nominees("Teams");
        opt3 = new Nominees("Zoom");
        
        bars= new BarGraph();
        circle= new CircleGraph();
        windowBars = new JFrame();
        windowCircle = new JFrame(); 
        ctrl= new Controller();
        view = new MainVotingFRM();
        
        //Controller
        ctrl.setOpt1(opt1);
        ctrl.setOpt2(opt2);
        ctrl.setOpt3(opt3);
        ctrl.setView(view);
        ctrl.setBars(bars);
        ctrl.setCircle(circle);
        ctrl.setWindowBars(windowBars);
        ctrl.setWindowCircle(windowCircle);
        view.setCtrl(ctrl);
        
        //Set the size of the windows that contains each graphs
        windowCircle.setSize(300,300);
        windowBars.setSize(300,300);
        
        //Set the location of the windows once a vote is made
        windowCircle.setLocation(-2,0);
        windowBars.setLocation(681,0);
        windowCircle.setVisible(true);
        windowBars.setVisible(true);
        view.setVisible(true);
      }
}
```

*Librerias Externas Utilizadas:*

- Jcommon-1.0.23

- JfreeChart-1.0.19

  https://sourceforge.net/projects/jfreechart/files/1.%20JFreeChart/

##### Ejecución

Frame Principal

<img src="C:\Users\vmlc1\AppData\Roaming\Typora\typora-user-images\image-20200505232219850.png" alt="image-20200505232219850" style="zoom:150%;" />







Al ejecutarse por primera vez se muestra así:

<img src="C:\Users\vmlc1\AppData\Roaming\Typora\typora-user-images\image-20200505232858102.png" alt="image-20200505232858102" style="zoom:150%;" />









Una vez que se ha votado se generan las ventanas secundarias:

![image-20200505233131551](C:\Users\vmlc1\AppData\Roaming\Typora\typora-user-images\image-20200505233131551.png)









Podemos seguir interactuando con los votos y las gráficas se irán actualizando en tiempo real

![image-20200505233257100](C:\Users\vmlc1\AppData\Roaming\Typora\typora-user-images\image-20200505233257100.png)



**Link de video de demostración:**

*(Recomendado: Verlo en FullScreen)*

https://drive.google.com/open?id=17My7s0tnyO68KntyU9IWxfou67Mtoyhq



