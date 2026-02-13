import java.awt.*;
import javax.swing.*;

public class Coin{
  int x1 = Game.width;
  int y1 = randInt(0, (int) Globals.barGround-100);
  Image image;
  
  Coin(){

    this.image = new ImageIcon("./JavaLessonGraphicsLesson-7/images/jewMoney.png").getImage();

  }
    
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
  void draw(){

    int drawX1 = x1 - (Globals.camX);
    int drawY = y1 - Globals.camY;
    if (Globals.coinAllowedToCollect) {
    Game.canvas.drawImage(this.image,
                          drawX1,
                          drawY,
                          32, //img width
                          32,//img height
                          null);   }


    if (drawX1 <= 0) {
      x1 += (Game.width);
      y1 = randInt(0, (int) Globals.barGround-100);
      Globals.coinAllowedToCollect = true;
    };

    Globals.coinX = drawX1;
    Globals.coinY = drawY;


    }

    void collect() {
      Globals.coinAllowedToCollect = false;
      System.out.println("AHHH");
      Globals.score++;
    }
  

}

