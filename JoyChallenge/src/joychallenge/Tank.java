/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package joychallenge;

import java.awt.Point;

/**
 *
 * @author ASUS
 */
public class Tank {
    public Point pos=new Point();
    public String ImagePath,ImagePath2;
    public Bullet Rocket=new Bullet();
    public int speed;
    public int score;
    public Tank (String ImagePath)
    {
        speed=5;
        score=0;
        //pos.x=X;
        //pos.y=Y;
        this.ImagePath=ImagePath;
        Rocket.imgPath="Rocket.gif";
    }

   

    void mover() {
        this.pos.x+=speed;

    }
      void movel() {
        this.pos.x-=speed;

    }

    public void fireBullet() {
        Rocket.pos.x=this.pos.x+60;
        Rocket.pos.y=this.pos.y;
        Thread t1=new Thread (Rocket);
        t1.start();
        
       
    }
}
