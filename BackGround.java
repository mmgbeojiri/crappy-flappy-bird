import java.awt.*;
import javax.swing.*;

class BackGround{
  int x1 = 0;
  int x2 = Game.width-17;
  Image image;
  
  BackGround(){

    this.image = new ImageIcon("./JavaLessonGraphicsLesson-7/images/day.png").getImage();

  }
  void draw(double parallax, int height, int yOffset, int xThreshold){

    int camXi = Globals.camX;        // use one integer offset everywhere
    int drawX1 = x1 - (int)(camXi*parallax);
    int drawX2 = x2 - (int)(camXi*parallax);

    Game.canvas.drawImage(this.image,
                          drawX1,
                          yOffset,
                          Game.width+xThreshold, //img width
                          height,//img height
                          null);   

    Game.canvas.drawImage(this.image,
                          drawX2,
                          yOffset,
                          Game.width+xThreshold, //img width
                          height,//img height
                          null);  


    if (drawX1 <= -Game.width) {
      x1 += (Game.width * 2);
    };

    if (drawX2 <= -Game.width) {
      x2 += (Game.width * 2);
    };

    }
}