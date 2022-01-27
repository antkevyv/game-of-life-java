import java.awt.*;

public class Config {
    public static final int SIZE = 10;
    public static final int WIDTH = 150;
    public static final int HEIGHT = 90;
    public static final int SLEEPMS = 30;

    public static Color getColor(Status status) {
        switch (status) {
            default:
            case NONE: return Color.BLACK;
            case BORN: return Color.ORANGE;
            case LIVE: return Color.WHITE;
            case DIED: return Color.GREEN;
        }
    }

}
