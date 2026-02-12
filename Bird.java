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
    



    Bird(double x, double y, double dx, int id) {
        this.x = x;
        this.y = y;
        this.image = new ImageIcon("./JavaLessonGraphicsLesson-7/images/yellow/Flap1.png").getImage();
        this.dx = dx;
        this.id = id;
    }

    double distToCoin() {
        return (Math.sqrt(Math.pow((x - Globals.camX)-Globals.coinX, 2) + Math.pow((y - Globals.camY)-Globals.coinY, 2)));
    }

    void draw() {
        x += dx;
        y += dy;
        dy += 0.5;
        frame += 0.1;
        this.image = new ImageIcon("./JavaLessonGraphicsLesson-7/images/yellow/Flap"+(int)Math.floor((frame % 3)+1) +".png").getImage();
        Game.canvas.drawImage(
        this.image,
        (int) x - Globals.camX,
        (int) y - Globals.camY,
        32,
        24,
        null);

        if (Mouse.leftPressed) {
            dy = -5;
        }

        if (y > Globals.barGround) {
            dx = 0;
            dy=0;
            y = Globals.barGround;
        }

        if (x<0) {
            try {
                Globals.birds.remove(id);
            } catch (Exception e) {
                System.err.println("Couldn't remove bird!");
            }
        }

        if (distToCoin() < 50 && Globals.coinAllowedToCollect) {
            Globals.coin.collect();
        }

        

    }
    
    
}
