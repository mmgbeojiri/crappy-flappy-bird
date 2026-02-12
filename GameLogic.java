
public class GameLogic {
    
  
  BackGround bk;
  Bar bar;
  Pipe pipes;

  

  Globals globals = new Globals();

  public GameLogic() {
    bk = new BackGround();
    bar = new Bar();
    Globals.birds.add(new Bird(Game.width/2, Game.height/2, 5, 0));
    pipes = new Pipe();

  }
  public void gameLoop(){
    bk.draw(0.1, Game.height,0,5);
    bar.draw(.5, Game.height/4,Game.height-100,0);
    for (Bird bird : Globals.birds) {
        bird.draw();
    }
    Globals.coin.draw();
    pipes.draw();
    Globals.camX += 5;

    Game.canvas.drawString("Coins: " + Globals.score, 10, 10);
    
  }






}
