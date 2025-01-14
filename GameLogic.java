import java.awt.*;
import javax.swing.*;

public class GameLogic {
    
  Bomb bomb;
  BackGround bk;
  
  public GameLogic() {
    bomb = new Bomb(180,20,0,1);
    bk = new BackGround();
  }
  public void gameLoop(){
    bk.draw();
    bomb.move();
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}
