package joychallenge;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class JoyChallenge {

   public static int NumberofBalls=10;
    public static void main(String[] args) {
       
       
        JFrame Ch4=new JFrame();
        Ch4.setSize(600, 600);
        Ch4.setTitle("Tank Game");
        Ch4.setResizable(false);
        Ch4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MovingBalls mb=new MovingBalls();
       
        mb.Balls.add(new Ball(50,50,20,Color.orange));
        mb.Balls.add(new Ball(100,100,20,Color.GREEN));
        mb.Balls.add(new Ball(160,160,15,Color.red));
        mb.Balls.add(new Ball(180,180,10,Color.CYAN));
        mb.Balls.add(new Ball(200,200,20,Color.YELLOW));
        mb.Balls.add(new Ball(220,220,18,Color.PINK));
        mb.Balls.add(new Ball(240,240,15,Color.BLUE));
        mb.Balls.add(new Ball(260,260,12,Color.DARK_GRAY));
        mb.Balls.add(new Ball(80,80,18,Color.PINK));
        mb.Balls.add(new Ball(60,60,11,Color.MAGENTA));


        Ch4.add(mb,BorderLayout.CENTER);
        mb.setFocusable(true);
        Thread t1=new Thread(mb);
        t1.start();
        Ch4.setVisible(true);
        
       
        
         
       
        
      
       
        
        
        
    }
    
}
