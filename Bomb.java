import java.awt.*;
import javax.swing.*;

class Bomb{
  int x,y;
  int dx,dy;
  int diameter;
  Image image;
  
  Bomb(int x, int y, int dx,int dy){
    this.x = x;
    this.y = y;
    this.dx = dx;
    this.dy = dy;    
    this.image = new ImageIcon("bomb.png").getImage();
  }
    void move(){
      //Move the ball down
      this.y+=this.dy;

      if(this.y > Game.height){
        this.y = 0;
      }

      draw();
    }
  
  void draw(){
    Game.canvas.drawImage(this.image,
                          this.x,
                          this.y,
                          40, //img width
                          50,//img height
                          null);   
  }

  
  boolean collidedWithMouse(){
    double dist = Math.sqrt( 
      Math.pow(this.x-Mouse.x,2 ) +
      Math.pow(this.y-Mouse.y,2 ) );
    
    return dist < this.diameter/2;
  }

  
}