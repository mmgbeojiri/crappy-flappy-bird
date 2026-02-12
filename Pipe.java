import java.awt.*;
import javax.swing.*;
public class Pipe {

  Image botimage;
  Image topimage;
  
  Pipe(){

    this.botimage = new ImageIcon("./JavaLessonGraphicsLesson-7/images/pipe_bot.png").getImage();
    this.topimage = new ImageIcon("./JavaLessonGraphicsLesson-7/images/pipe_top.png").getImage();


  }

  void draw(){

   
    
    Game.canvas.drawImage(this.botimage,
                          Globals.coinX,
                          Globals.coinY + 200 - 100,
                          52, //img width
                          270,//img height
                          null);   
                            
                          
                          
        Game.canvas.drawImage(this.topimage,
                          Globals.coinX,
                          Globals.coinY - 200 - 100,
                          52, //img width
                          270,//img height
                          null); 
                        
                        
                        }

                          





    }

