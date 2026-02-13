import java.util.ArrayList;

public class Globals {
    public static int camX = 0;
    public static int camY = 0;
    public static double barGround = (Game.height*0.75)+20;
    public static ArrayList<Bird> birds = new ArrayList<>();

    public static int coinX, coinY;
    public static Coin coin = new Coin();

    public static boolean coinAllowedToCollect = true;

    public static int score = 0;
    public static boolean levelStart = false;
}
