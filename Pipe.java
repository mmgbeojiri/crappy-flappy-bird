import java.awt.*;
import javax.swing.*;
public class Pipe {

  Image capImage;
  Image lineImage;
  
  Pipe(){

    this.capImage = new ImageIcon("./JavaLessonGraphicsLesson-7/images/pipe_cap.png").getImage();
    this.lineImage = new ImageIcon("./JavaLessonGraphicsLesson-7/images/pipe_line.png").getImage();


  }

  void draw(){

   
    
    Game.canvas.drawImage(this.capImage,
                          Globals.coinX-22, //22 is the width of the pipe minus width of coin
                          Globals.coinY + 100,
                          52*2, //img width
                          24*2,//img height
                          null);   
                            
                          
                          
        Game.canvas.drawImage(this.capImage,
                          Globals.coinX-22,
                          Globals.coinY - 100,
                          52*2, //img width
                          24*2,//img height
                          null); 
                        
                        
                          
                          Game.canvas.drawImage(this.lineImage,
                            Globals.coinX-18, //22 is the width of the pipe minus width of coin
                            Globals.coinY + 100+48,
                            48*2, //img width
                            Game.height,//img height
                            null); 

                            Game.canvas.drawImage(this.lineImage,
                            Globals.coinX-18, //22 is the width of the pipe minus width of coin
                            Globals.coinY - 780,
                            48*2, //img width
                            Game.height,//img height
                            null); 
                            
                            
                            
                            
                            
                            
                          }

    }

