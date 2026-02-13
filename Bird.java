import java.awt.*;
import javax.swing.*;

public class Bird {
    double x = 0;
    double y = 0;
    double dx = 0;
    double dy = 0;
    Image image;
    double frame = 0;
    int id;
    boolean  alive = true;



    Bird(double x, double y, double dx, int id) {
        this.x = x;
        this.y = y;
        this.image = new ImageIcon("./JavaLessonGraphicsLesson-7/images/yellow/Flap1.png").getImage();
        this.dx = dx;
        this.id = id;
        Globals.onscreenBirds++;
    }
    void setVel(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }
   

    double distToCoin() {
        return (Math.sqrt(Math.pow((x - Globals.camX)-Globals.coinX, 2) + Math.pow((y - Globals.camY)-Globals.coinY, 2)));
    }
    void die() {
            dx = 0;
            alive = false;
            
    }
    void draw() {
        x += dx;
        y += dy;
        if (Globals.levelStart) {
        dy += 0.5;
        if (alive && Mouse.leftPressed) {
            dy = -5;
        }
        }
        frame += 0.1;
        this.image = new ImageIcon("./JavaLessonGraphicsLesson-7/images/yellow/Flap"+(int)Math.floor((frame % 3)+1) +".png").getImage();
        Game.canvas.drawImage(
        this.image,
        (int) x - Globals.camX,
        (int) y - Globals.camY,
        32,
        24,
        null);

        

        if (y > Globals.barGround) {
            die();
            dy=0;
            y = Globals.barGround;
        }

        if (x - Globals.camX < 0) {
            try {
                Globals.onscreenBirds--;
            } catch (Exception e) {
                System.err.println("Couldn't remove bird!");
            }
        }



        if (distToCoin() < 50 && Globals.coinAllowedToCollect) {
            Globals.coin.collect();
        }

        if (Math.abs((x - Globals.camX)-Globals.coinX) < 50) {
            if (Math.abs((y - Globals.camY)-Globals.coinY) > 100) {
                die();
            }
        }

        

    }
    
    
}
