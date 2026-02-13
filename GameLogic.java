import java.awt.*;
import javax.swing.*;

public class GameLogic {
    
  
  BackGround bk;
  Pipe pipes;
  Bar bar;

  Image logoImage = new ImageIcon("./JavaLessonGraphicsLesson-7/images/logo.png").getImage();
  

  Globals globals = new Globals();

  public GameLogic() {
    bk = new BackGround();
    bar = new Bar();
    Globals.birds.add(new Bird(Game.width/2, Game.height/2, 0, 0));
    pipes = new Pipe();

  }
  public void gameLoop(){
    bk.draw(0.1, Game.height,0,5);
    for (Bird bird : Globals.birds) {
      bird.draw();
    }
    if (Globals.levelStart) {
      Globals.coin.draw();
      pipes.draw();
      Globals.camX += 5;
      Game.canvas.drawString("Coins: " + Globals.score, 10, 10);
    } else {
      Game.canvas.drawImage(logoImage, Game.width/2 - (195), Game.height/4, 195*2, 58*2, null);
      if (Mouse.leftClick) {
        Globals.levelStart = true;
          for (Bird bird : Globals.birds) {
          bird.setVel(5, -5);
        }
      }
    }
    bar.draw(.5, Game.height/4,Game.height-100,0);

    
  }






}
